package com.example.herbchan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    // This is the Key from the Map in the Intent
    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }


    // Compute and display a random number between 0 and the current total_count
    public void showRandomNumber() {
        Intent initiatingIntent = getIntent();

        int count = initiatingIntent.getIntExtra(TOTAL_COUNT, 0);

        TextView headerView = (TextView) findViewById(R.id.textView_label);
        TextView randomView = (TextView) findViewById(R.id.textView_random);

        Random random = new Random();
        int randomInt = 0;
        if (count > 0) {
            randomInt = random.nextInt(count);
        }

        headerView.setText(getString(R.string.random_heading, count));
        randomView.setText(Integer.toString(randomInt));
    }
}
