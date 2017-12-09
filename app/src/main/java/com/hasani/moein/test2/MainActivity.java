package com.hasani.moein.test2;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

//dakhel gradle bayad ezafe konim library ash ra

public class MainActivity extends AppCompatActivity {

    GifDrawable gifDrawable;
    GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifImageView=findViewById(R.id.gifImageView);

        Button button=findViewById(R.id.button);

        try {


             gifDrawable=new
                   GifDrawable(getResources(),R.drawable.loadin);
            gifImageView.setImageDrawable(gifDrawable);


            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gifDrawable.pause();
                }});


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
