package com.example.rayng.liftwithme;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    long squatPR, benchPR, deadPR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.liftsSummary);
        TextView squatView = findViewById(R.id.squatSummary);
        TextView benchView = findViewById(R.id.benchSummary);
        TextView deadView = findViewById(R.id.deadSummary);

        squatPR = 245;//You will have to check the server for the correct value here.
        benchPR = 145;
        deadPR = 315;

        String squat_message = "Squat 1RM is : " + squatPR;
        String bench_message = "Benchpress 1RM is : " + benchPR;
        String dead_message = "Deadlift 1RM is : " + deadPR;

        textView.setText(R.string.summary_title);
        squatView.setText(squat_message);
        benchView.setText(bench_message);
        deadView.setText(dead_message);

    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

}
