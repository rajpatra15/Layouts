package com.example.rajeshwar.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;

public class layoutActivity extends AppCompatActivity {

    public void fade(View view){

        Log.d(layoutActivity.class.getSimpleName(),"Fade  method");
        ImageView theBackground =(ImageView) findViewById(R.id.theBGImageView);
        ImageView theBackground1 =(ImageView) findViewById(R.id.theBG1ImageView);

        theBackground.animate().alpha(0f).setDuration(3000);

       theBackground1.animate().alpha(1f).setDuration(3000);
        //theBackground.setImageResource(R.drawable.nagaraj2);
    }

    public void fade1(View view){

        Log.d(layoutActivity.class.getSimpleName(),"Fade 1  method");
        ImageView theBackground =(ImageView) findViewById(R.id.theBGImageView);
        ImageView theBackground1 =(ImageView) findViewById(R.id.theBG1ImageView);



        theBackground1.animate().alpha(0f).setDuration(3000);
        theBackground.animate().alpha(1f).setDuration(3000);
        //theBackground.setImageResource(R.drawable.nagaraj2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
    }
}
