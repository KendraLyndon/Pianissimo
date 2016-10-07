package com.example.kendralyndon.pianopractice;

/**
 * Created by kendralyndon on 10/6/16.
 */

import android.app.Activity;
import android.content.Context;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Pianokey extends AppCompatActivity{

    public Activity activity;
    private int mySoundId;
    private int myviewid;
    private ImageView myKey;
    private int soundClip;
    private SoundPool pianoSounds;
    private View.OnClickListener myClickListener;

    // empty constructor
    public Pianokey(){

    }

    public Pianokey(Activity a, Context context, int soundId, int viewid ) {

        this.activity = a;
        mySoundId = soundId;
        myviewid = viewid;
        pianoSounds = new SoundPool.Builder().build();
        myKey = (ImageView)this.activity.findViewById(myviewid);
        soundClip = pianoSounds.load(context, mySoundId, 1);

        myClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                playKey(soundClip);
            }
        };
        myKey.setOnClickListener(myClickListener);
    }

    public void playKey(int sc) {
        pianoSounds.play(sc, 1, 1, 1, 0, 1);
    }
}
