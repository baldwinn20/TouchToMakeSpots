package com.example.baldwinn20.lecture9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar circleSizeSeekBar = (SeekBar)findViewById(R.id.seekBar);
        CircleView cv = (CircleView)findViewById(R.id.CircleView);
        SeekBarHandler sbh = new SeekBarHandler(cv);

        circleSizeSeekBar.setOnSeekBarChangeListener(sbh);
    }
}
