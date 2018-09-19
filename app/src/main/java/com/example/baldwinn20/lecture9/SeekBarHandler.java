package com.example.baldwinn20.lecture9;
import android.widget.SeekBar;

public class SeekBarHandler implements SeekBar.OnSeekBarChangeListener {
protected Spot leSpot;
protected CircleView myCircleView;
public SeekBarHandler(CircleView cv, Spot sp) {
    leSpot = sp;
    myCircleView = cv;
}

public  void onProgressChanged (SeekBar seekBar, int progress, boolean fromUser) {
    //use progress to set size of the circle
    myCircleView.setSize(progress*2);
    leSpot.setSize(progress*2);
}

public void onStartTrackingTouch(SeekBar seekBar) {

}

public void onStopTrackingTouch(SeekBar seekbar) {

}
}
