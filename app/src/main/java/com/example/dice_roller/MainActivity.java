package com.example.dice_roller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview;


    class Dice
    {
        private int numSides;
        private Random random;

        public Dice(int numSides)
        {
            this.numSides = numSides;
            random = new Random();
        }
        public int roll ()
        {
            return random.nextInt(numSides) + 1;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.roll);
        textview = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view)
            {

                Dice dice = new Dice(6);
                int diceRoll = dice.roll();
                textview.setText(Integer.toString(diceRoll));


            }

        });


    }
}