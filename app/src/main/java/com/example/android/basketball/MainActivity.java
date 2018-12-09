package com.example.android.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreeA(View view)
    {
        scoreA += 3;
        displayA(scoreA);
    }

    public void plusTwoA(View view)
    {
        scoreA += 2;
        displayA(scoreA);
    }

    public void plusOneA(View view)
    {
        scoreA += 1;
        displayA(scoreA);
    }

    public void displayA(int number)
    {
        TextView scoreTVA = (TextView) findViewById(R.id.score_tvA);
        scoreTVA.setText("" + number);
    }
    //----------------------------------------------------------------------
    // TEAM B
    public void plusThreeB(View view)
    {
        scoreB += 3;
        displayB(scoreB);
    }

    public void plusTwoB(View view)
    {
        scoreB += 2;
        displayB(scoreB);
    }

    public void plusOneB(View view)
    {
        scoreB += 1;
        displayB(scoreB);
    }

    public void displayB(int number)
    {
        TextView scoreTVB = (TextView) findViewById(R.id.score_tvB);
        scoreTVB.setText("" + number);
    }
//--------------------------CLEAR-------------------------
    public void clear(View view)
    {
        TextView scoreTVA = (TextView) findViewById(R.id.score_tvA);
        TextView scoreTVB = (TextView) findViewById(R.id.score_tvB);
        scoreTVA.setText(0 + "");
        scoreTVB.setText(0 + "");
        scoreA = 0;
        scoreB = 0;
    }
}
