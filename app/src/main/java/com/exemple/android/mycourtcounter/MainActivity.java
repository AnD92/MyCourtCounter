package com.exemple.android.mycourtcounter;

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
    int scoreA=0;
    int scoreB=0;
    int foulsA=0;
    int foulsB=0;
    int yellowCardA=0;
    int yellowCardB=0;
    int redCardA=0;
    int redCardB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
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
    }

    public void addGolTeamA(View v) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void addGolTeamB(View v) {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void addFoulTeamA(View v) {
        foulsA++;
        displayFoulsA(foulsA);
    }

    public void addFoulTeamB(View v) {
        foulsB++;
        displayFoulsB(foulsB);
    }

    public void addYellowTeamA(View v) {
        yellowCardA++;
        displayYellowsA(yellowCardA);
    }

    public void addYellowTeamB(View v) {
        yellowCardB++;
        displayYellowsB(yellowCardB);
    }

    public void addRedTeamA(View v) {
        redCardA++;
        displayRedA(redCardA);
    }

    public void addRedTeamB(View v) {
        redCardB++;
        displayRedB(redCardB);
    }

    public void reset(View v){
        int scoreA=0;
        int scoreB=0;
        int foulsA=0;
        int foulsB=0;
        int yellowCardA=0;
        int yellowCardB=0;
        int redCardA=0;
        int redCardB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayFoulsA(foulsA);
        displayFoulsB(foulsB);
        displayYellowsA(yellowCardA);
        displayYellowsB(yellowCardB);
        displayRedA(redCardA);
        displayRedB(redCardB);
    }



    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_number_of_fouls);
        scoreView.setText(String.valueOf(fouls));
    }
    public void displayFoulsB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_number_of_fouls);
        scoreView.setText(String.valueOf(fouls));
    }
    public void displayYellowsA(int card) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_number_of_yellows);
        scoreView.setText(String.valueOf(card));
    }
    public void displayYellowsB(int card) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_number_of_yellows);
        scoreView.setText(String.valueOf(card));
    }
    public void displayRedA(int card) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_number_of_reds);
        scoreView.setText(String.valueOf(card));
    }
    public void displayRedB(int card) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_number_of_reds);
        scoreView.setText(String.valueOf(card));
    }
}
