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
    int teamBTwoPointers;
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
     * These methods will keep track of and display stats for red team
     */
    public void displayRedThrees(int teamAThreePointers) {
        TextView scoreView = (TextView) findViewById(R.id.red_three_view);
        scoreView.setText(String.valueOf(teamAThreePointers));
    }
    public void displayRedTwos(int teamATwoPointers) {
        TextView scoreView = (TextView) findViewById(R.id.red_two_view);
        scoreView.setText(String.valueOf(teamATwoPointers));
    }
    public void displayRedFrees(int teamAFreeThrows) {
        TextView scoreView = (TextView) findViewById(R.id.red_free_view);
        scoreView.setText(String.valueOf(teamAFreeThrows));
    }
    /**
     *  These methods increment the score by 3, 2 and 1 for home team
     */
    public void threePointer(View view) {
        teamAScore += 3;
        teamAThreePointers += 1;
        displayForTeamA(teamAScore);
        displayRedThrees(teamAThreePointers);
    }

    public void twoPointer(View view) {
        teamAScore += 2;
        teamATwoPointers += 1;
        displayForTeamA(teamAScore);
        displayRedTwos(teamATwoPointers);
    }

    public void freeThrow(View view) {
        teamAScore += 1;
        teamAFreeThrows += 1;
        displayForTeamA(teamAScore);
        displayRedFrees(teamAFreeThrows);
    }

    /**
     * Displays the score for blue team
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /** Displays the number of 3's 2's and frees made for blue team
     *
     */
    public void displayBlueThrees(int teamBThreePointers) {
        TextView scoreView = (TextView) findViewById(R.id.blue_three_view);
        scoreView.setText(String.valueOf(teamBThreePointers));
    }
    public void displayBlueTwos(int teamBTwoPointers) {
        TextView scoreView = (TextView) findViewById(R.id.blue_two_view);
        scoreView.setText(String.valueOf(teamBTwoPointers));
    }
    public void displayBlueFrees(int teamBFreeThrows) {
        TextView scoreView = (TextView) findViewById(R.id.blue_free_view);
        scoreView.setText(String.valueOf(teamBFreeThrows));
    }
    /** Methods for increasing Score for blue team
     *
     */

    public void threePointerB(View view) {
        teamBScore += 3;
        teamBThreePointers += 1;
        displayForTeamB(teamBScore);
        displayBlueThrees(teamBThreePointers);
    }

    public void twoPointerB(View view) {
        teamBScore += 2;
        teamBTwoPointers += 1;
        displayForTeamB(teamBScore);
        displayBlueTwos(teamBTwoPointers);
    }

    public void freeThrowB(View view) {
        teamBScore += 1;
        teamBFreeThrows += 1;
        displayForTeamB(teamBScore);
        displayBlueFrees(teamBFreeThrows);
    }

    public void resetScores(View view) {
        teamAScore = 0;
        teamAThreePointers = 0;
        teamATwoPointers = 0;
        teamAFreeThrows = 0;

        teamBScore = 0;
        teamBThreePointers = 0;
        teamBTwoPointers = 0;
        teamBFreeThrows = 0;

        displayForTeamA(teamAScore);
        displayRedThrees(teamAThreePointers);
        displayRedTwos(teamATwoPointers);
        displayRedFrees(teamAFreeThrows);


        displayForTeamB(teamBScore);
        displayBlueThrees(teamBThreePointers);
        displayBlueTwos(teamBTwoPointers);
        displayBlueFrees(teamBFreeThrows);
    }
}
