package com.example.kendralyndon.pianopractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


//    SoundPool pianoSounds;
//    ImageView c4Key;
//    ImageView c5Key;
//    int c4;
    private Pianokey c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        pianoSounds = new SoundPool.Builder().build();
//        c4Key = (ImageView)findViewById(R.id.c4Key);
//        c4 = pianoSounds.load(this, R.raw.p040, 1);

//        System.out.println("The integer we are looking for is "+R.id.c4Key);

        c4 = new Pianokey(this, R.raw.p040, R.id.c4Key);

//        View.OnClickListener myClickListener = new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                pianoSounds.play(c4, 1, 1, 1, 0, 1);
//            }
//        };

//        c4Key.setOnClickListener(myClickListener);
    }
}