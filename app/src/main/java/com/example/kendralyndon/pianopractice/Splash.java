package com.example.kendralyndon.pianopractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kendralyndon on 10/10/16.
 */

public class Splash extends Activity {

    private Button myLaunchButton;
    private View.OnClickListener myClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        myLaunchButton = (Button)findViewById(R.id.launchButton);

        myClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);

            }
        };

        myLaunchButton.setOnClickListener(myClickListener);

    }

}
