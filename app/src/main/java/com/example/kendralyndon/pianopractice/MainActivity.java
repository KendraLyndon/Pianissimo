package com.example.kendralyndon.pianopractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    private Pianokey c4;
//    private Pianokey d4;
//    private Pianokey e4;
//    private Pianokey f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pianokey c4 = new Pianokey(this, this, R.raw.c4, R.id.c4Key);
        Pianokey d4 = new Pianokey(this, this, R.raw.d4, R.id.d4Key);
        Pianokey e4 = new Pianokey(this, this, R.raw.e4, R.id.e4Key);
        Pianokey f4 = new Pianokey(this, this, R.raw.f4, R.id.f4Key);
        Pianokey g4 = new Pianokey(this, this, R.raw.g4, R.id.g4Key);
        Pianokey a4 = new Pianokey(this, this, R.raw.a4, R.id.a4Key);
        Pianokey b4 = new Pianokey(this, this, R.raw.b4, R.id.b4Key);
        Pianokey c5 = new Pianokey(this, this, R.raw.c5, R.id.c5Key);
        Pianokey cSharp4 = new Pianokey(this, this, R.raw.c_sharp4, R.id.cSharp4Key);
        Pianokey dSharp4 = new Pianokey(this, this, R.raw.d_sharp4, R.id.dSharp4Key);
        Pianokey fSharp4 = new Pianokey(this, this, R.raw.f_sharp4, R.id.fSharp4Key);
        Pianokey gSharp4 = new Pianokey(this, this, R.raw.g_sharp4, R.id.gSharp4Key);
        Pianokey aSharp4 = new Pianokey(this, this, R.raw.a_sharp4, R.id.aSharp4Key);

//        String[] keys = []

//        for (int i = 0; i < 8; i++) {
//            String keyLoc = "c"+i.toString();
//            PianoKey myC = new PianoKey(R.raw.p040, R.id.c4key);
//         }
    }
}