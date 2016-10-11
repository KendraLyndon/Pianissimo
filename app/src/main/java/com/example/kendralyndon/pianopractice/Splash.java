package com.example.kendralyndon.pianopractice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by kendralyndon on 10/10/16.
 */

public class Splash extends Activity {

    private Button myLaunchButton;
    private View.OnClickListener myClickListener;
    private RelativeLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        myLayout = (RelativeLayout)findViewById(R.id.splashLayout);
        myLayout.setBackgroundTintMode(PorterDuff.Mode.LIGHTEN);

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
