package com.example.kendralyndon.pianopractice;

import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View noPlay;
    private View.OnClickListener myClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] soundfiles = {
                R.raw.note01,R.raw.note02,R.raw.note03,
                R.raw.note04,R.raw.note05,R.raw.note06,R.raw.note07,R.raw.note08,R.raw.note09,
                R.raw.note10,R.raw.note11,R.raw.note12,R.raw.note13,R.raw.note14,R.raw.note15,
                R.raw.note16,R.raw.note17,R.raw.note18,R.raw.note19,R.raw.note20,R.raw.note21,
                R.raw.note22,R.raw.note23,R.raw.note24,R.raw.note25,R.raw.note26,R.raw.note27,
                R.raw.note28,R.raw.note29,R.raw.note30,R.raw.note31,R.raw.note32,R.raw.note33,
                R.raw.note34,R.raw.note35,R.raw.note36,R.raw.note37,R.raw.note38,R.raw.note39,
                R.raw.note40, R.raw.note41,R.raw.note42,R.raw.note43,R.raw.note44,
                R.raw.note45,R.raw.note46,R.raw.note47,R.raw.note48,R.raw.note49,R.raw.note50,
                R.raw.note51,R.raw.note52,R.raw.note53,R.raw.note54,R.raw.note55,R.raw.note56,
                R.raw.note57,R.raw.note58,R.raw.note59,R.raw.note60,R.raw.note61,R.raw.note62,
                R.raw.note63,R.raw.note64,R.raw.note65,R.raw.note66,R.raw.note67,R.raw.note68,
                R.raw.note69,R.raw.note70,R.raw.note71,R.raw.note72,R.raw.note73,R.raw.note74,
                R.raw.note75,R.raw.note76,R.raw.note77,R.raw.note78,R.raw.note79,R.raw.note80,
                R.raw.note81,R.raw.note82,R.raw.note83,R.raw.note84,R.raw.note85,R.raw.note86,
                R.raw.note87,R.raw.note88};
        int[] viewids = {
                R.id.key01,R.id.key02,R.id.key03,R.id.key04,
                R.id.key05,R.id.key06,R.id.key07,R.id.key08,R.id.key09,R.id.key10,
                R.id.key11,R.id.key12,R.id.key13,R.id.key14,R.id.key15,R.id.key16,R.id.key17,
                R.id.key18,R.id.key19,R.id.key20,R.id.key21,R.id.key22,R.id.key23,
                R.id.key24,R.id.key25,R.id.key26,R.id.key27,R.id.key28,R.id.key29,R.id.key30,
                R.id.key31,R.id.key32,R.id.key33,R.id.key34,R.id.key35,R.id.key36,R.id.key37,
                R.id.key38,R.id.key39,R.id.key40,R.id.key41,R.id.key42,R.id.key43,R.id.key44,
                R.id.key45,R.id.key46,R.id.key47,R.id.key48,R.id.key49,R.id.key50,
                R.id.key51,R.id.key52,R.id.key53,R.id.key54,R.id.key55,R.id.key56,R.id.key57,
                R.id.key58,R.id.key59,R.id.key60,R.id.key61,R.id.key62,R.id.key63,R.id.key64,
                R.id.key65,R.id.key66,R.id.key67,R.id.key68,R.id.key69,R.id.key70,
                R.id.key71,R.id.key72,R.id.key73,R.id.key74,R.id.key75,R.id.key76,R.id.key77,
                R.id.key78,R.id.key79,R.id.key80,R.id.key81,R.id.key82,R.id.key83,R.id.key84,
                R.id.key85,R.id.key86,R.id.key87,R.id.key88};

        SoundPool octave01Sounds = new SoundPool.Builder().setMaxStreams(20).build();
        SoundPool octave2Sounds = new SoundPool.Builder().setMaxStreams(20).build();
        SoundPool octave3Sounds = new SoundPool.Builder().setMaxStreams(20).build();
        SoundPool octave4Sounds = new SoundPool.Builder().setMaxStreams(20).build();
        SoundPool octave5Sounds = new SoundPool.Builder().setMaxStreams(20).build();
        SoundPool octave6Sounds = new SoundPool.Builder().setMaxStreams(20).build();
        SoundPool octave78Sounds = new SoundPool.Builder().setMaxStreams(20).build();

        for (int i=0; i<15; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave01Sounds);
        }
        for (int i=15; i<27; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave2Sounds);
        }
        for (int i=27; i<39; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave3Sounds);
        }
        for (int i=39; i<51; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave4Sounds);
        }
        for (int i=51; i<63; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave5Sounds);
        }
        for (int i=63; i<75; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave6Sounds);
        }
        for (int i=75; i<88; i++){

            Pianokey key = new Pianokey(this, this, soundfiles[i], viewids[i], octave78Sounds);
        }

        noPlay = findViewById(R.id.noPlaying);

        myClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            }
        };

        noPlay.setOnClickListener(myClickListener);

    }
}