package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButtton;
        rollButtton=findViewById(R.id.rollButton);

        final ImageView d1=findViewById(R.id.image_leftDice);
        final ImageView d2=findViewById(R.id.image_rightDice);

        final int[] diceArray={R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand=new Random();


                int r=rand.nextInt(6);
                d1.setImageResource(diceArray[r]);
                r=rand.nextInt(6);
                d2.setImageResource(diceArray[r]);

            }
        });
    }
}
