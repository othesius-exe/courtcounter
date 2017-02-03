package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /** Team A Variables
     *
     */
    int teamAScore;
    int teamAThreePointers;
    int teamATwoPointers;
    int teamAFreeThrows;

    /** Team B Variables
     *
     */

    int teamBScore;
    int teamBThreePointers;
    int teamBtwoPointers;
    int teamBFreeThrows;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  These methods increment the score by 3, 2 and 1 for home team
     */
    public void threePointer(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void twoPointer(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void freeThrow(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the score for team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /** Methods for increasing Score for team B
     *
     */

    public void threePointerB(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void twoPointerB(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void freeThrowB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }

    public void resetScores(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
