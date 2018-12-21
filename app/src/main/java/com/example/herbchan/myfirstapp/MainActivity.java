package com.example.herbchan.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show a Toast
     * @param view
     */
    public void toastMe(View view) {
        Toast myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    /**
     * Increase the counter
     * @param view
     */
    public void countMe(View view) {
        // Get the TextView object
        TextView showCountTextView = (TextView) findViewById(R.id.counterTextView);

        // Get the value of the TextView
        String countString = showCountTextView.getText().toString();

        // Convert the value to a number and increment it
        Integer count = Integer.parseInt(countString);
        count++;

        // Display the new value in the TextView
        showCountTextView.setText(count.toString());
    }

    /**
     * Pick a random number between 0 and Count
     * @param view
     */
    public void randomMe(View view) {
        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, SecondActivity.class);

        // Get the value of the Count TextView
        TextView showCountView = (TextView) findViewById(R.id.counterTextView);
        int count = Integer.parseInt(showCountView.getText().toString());

        // update the Map in the Intent with a Key and Value
        randomIntent.putExtra(TOTAL_COUNT, count);

        // Start the new activity
        startActivity(randomIntent);
    }
}
