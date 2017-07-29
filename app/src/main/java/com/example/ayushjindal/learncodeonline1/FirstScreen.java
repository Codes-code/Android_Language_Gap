package com.example.ayushjindal.learncodeonline1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class FirstScreen extends AppCompatActivity {

    TextView Randi;
    TextView CheapRandi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Randi = (TextView) findViewById(R.id.English);
        CheapRandi = (TextView) findViewById(R.id.Hindi);

    }


    public void Ball(View v)
    {
        Randi.setVisibility(View.INVISIBLE);
        CheapRandi.setVisibility(View.VISIBLE);
    }

    public void Doll(View v)
    {
        CheapRandi.setVisibility(View.INVISIBLE);
        Randi.setVisibility(View.VISIBLE);
    }
}


//TODO NTCC KE LIYE APPLICAITON
