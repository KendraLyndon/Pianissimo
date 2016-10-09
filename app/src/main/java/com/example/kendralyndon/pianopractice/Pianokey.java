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
    private int mySoundId;
    private int myviewid;
    private ImageView myKey;
    private int soundClip;
    private SoundPool pianoSounds;
    private View.OnTouchListener myTouchListener;
    private View.OnClickListener myClickListener;
//    private MediaPlayer mp;

    // empty constructor
    public Pianokey(){

    }

    public Pianokey(Activity a, final Context context, int soundId, int viewid ) {

        this.activity = a;
        mySoundId = soundId;
        myviewid = viewid;
        pianoSounds = new SoundPool.Builder().build();
        soundClip = pianoSounds.load(context, mySoundId, 1);
        myKey = (ImageView)this.activity.findViewById(myviewid);

        myTouchListener = new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent e){

                System.out.println(e);

                if(e.getAction() == MotionEvent.ACTION_DOWN){

                    pianoSounds.play(soundClip, 1, 1, 1, 0, 1);
                }
                if (e.getAction() == MotionEvent.ACTION_UP){

                    pianoSounds.stop(soundClip);
                }

                return true;
            }
        };

        myKey.setOnTouchListener(myTouchListener);
    }

}
