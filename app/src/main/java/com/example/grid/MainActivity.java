package com.example.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img1= (ImageView) findViewById(R.id.image);

        img1= (ImageView) findViewById(R.id.image2);

        img1= (ImageView) findViewById(R.id.image3);

        img1= (ImageView) findViewById(R.id.image4);

        img1= (ImageView) findViewById(R.id.image5);

        img1= (ImageView) findViewById(R.id.image6);

        img1= (ImageView) findViewById(R.id.image7);

        img1= (ImageView) findViewById(R.id.image8);

        img1= (ImageView) findViewById(R.id.image9);

    }
    @Override
    public void onClick(View v) {

        img1.setImageResource(R.drawable.mario);
        img2.setImageResource(R.drawable.mario);
        img4.setImageResource(R.drawable.mario);
        img3.setImageResource(R.drawable.mario);
        img6.setImageResource(R.drawable.mario);
        img5.setImageResource(R.drawable.mario);
        img7.setImageResource(R.drawable.mario);
        img8.setImageResource(R.drawable.mario);
        img9.setImageResource(R.drawable.mario);

    }
}

