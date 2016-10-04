package com.example.kendralyndon.pianopractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView highCKey =(ImageView)findViewById(R.id.highCKey);

        View.OnClickListener myClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d(TAG, "onClick: clicked");
            }
        };

        highCKey.setOnClickListener(myClickListener);

    }

}
