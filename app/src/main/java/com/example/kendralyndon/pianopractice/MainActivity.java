package com.example.kendralyndon.pianopractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] soundfiles = {R.raw.c4, R.raw.c_sharp4,R.raw.d4,R.raw.d_sharp4,R.raw.e4,
                R.raw.f4,R.raw.f_sharp4,R.raw.g4,R.raw.g_sharp4,R.raw.a4,R.raw.a_sharp4,
                R.raw.b4};
        int[] viewids = {R.id.c4Key,R.id.cSharp4Key,R.id.d4Key,R.id.dSharp4Key,R.id.e4Key,
                R.id.f4Key,R.id.fSharp4Key,R.id.g4Key,R.id.gSharp4Key,R.id.a4Key,R.id.aSharp4Key,
                R.id.b4Key};

        for (int i=0; i<12; i++){
            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i]);
        }
//        for (int i = 0; i < 8; i++) {
//            String keyLoc = "c"+i.toString();
//            PianoKey myC = new PianoKey(R.raw.p040, R.id.c4key);
//         }
    }
}