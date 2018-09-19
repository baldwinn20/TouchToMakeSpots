package com.example.baldwinn20.lecture9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;

public class CircleView extends SurfaceView implements View.OnTouchListener {

    protected int size;
    protected ArrayList<Spot> theSpots;

    public CircleView(Context context, AttributeSet attrs) {

        super(context, attrs);
        setWillNotDraw(false);
        size = 50;
        theSpots = new ArrayList<Spot>();
        setOnTouchListener(this);
    }
    public void onDraw (Canvas canvas){

        Paint green = new Paint();
        green.setColor(Color.GREEN);

        canvas.drawCircle(500, 400, size, green);

    for (Spot spot: theSpots)
    spot.draw(canvas);

    }

    public void setSize(int sz) {
        size = sz;
        this.invalidate();
    }

    public boolean onTouch (View v, MotionEvent event){

        if(event.getAction() == MotionEvent.ACTION_DOWN) {

            // create a new spot for each tap
            // find where they touched
            int x = (int) event.getX();
            int y = (int) event.getY();

            //Create the spot at the correct location
            Spot aSpot = new Spot(x, y);
            theSpots.add(aSpot);

            //redraw now that there is an extra spot
            invalidate();
            return true;
        }
    return false;
    }


}
