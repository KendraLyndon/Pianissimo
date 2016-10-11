package com.example.kendralyndon.pianopractice;

/**
 * Created by kendralyndon on 10/6/16.
 */

import android.app.Activity;
import android.content.Context;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class Pianokey extends AppCompatActivity{

    public Activity activity;
    private SoundPool myPianoSounds;
    private int mySoundId;
    private int myStreamId;
    private int myviewid;
    private ImageView myKey;
    private int soundClip;
    private View.OnTouchListener myTouchListener;


    // empty constructor
    public Pianokey(){

    }

    public Pianokey(Activity a, final Context context, int soundId, int viewid, SoundPool pianoSounds) {

        this.activity = a;
        mySoundId = soundId;
        myviewid = viewid;
        myPianoSounds = pianoSounds;
        soundClip = myPianoSounds.load(context, mySoundId, 1);
        myKey = (ImageView)this.activity.findViewById(myviewid);

        myTouchListener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent e){

                System.out.println(e);
                myKey.getParent().requestDisallowInterceptTouchEvent(true);

                if(e.getAction() == MotionEvent.ACTION_DOWN){

                    myStreamId = myPianoSounds.play(soundClip, 1, 1, 1, 0, 1);

                }
                if (e.getAction() == MotionEvent.ACTION_UP){

                    myPianoSounds.setVolume(myStreamId, 0.1f, 0.1f);
                    new android.os.Handler().postDelayed(
                            new Runnable() {
                                public void run() {
                                    myPianoSounds.stop(myStreamId);
                                }
                            },
                            300);
                }

                return true;
            }
        };

        myKey.setOnTouchListener(myTouchListener);
    }

}
