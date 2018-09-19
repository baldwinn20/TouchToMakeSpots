package com.example.baldwinn20.lecture9;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Spot {

protected int x; //x-coord
protected int y; //y-coor
protected int size = (int)(Math.random()*50);
protected Paint myPaint; //how the spot is drawn

protected void setRandomPaint() {
    //Creates random rgb values
    int color = Color.rgb( (int)(Math.random()*256),
                           (int)(Math.random()*256),
                           (int)(Math.random()*256));
myPaint = new Paint();
myPaint.setColor(color);
}

//initializes a spot with random values
public Spot() {

    x=(int)(Math.random() *500)+5;
    y=(int)(Math.random() *500)+5;
    setRandomPaint();
}

public Spot(int initX, int initY) {
    //place a spot in a random location
    x = initX;
    y = initY;
    setRandomPaint();
}

    public void setSize(int sz) {
        size = sz;
        //this.invalidate();
    }

public void draw(Canvas canvas) {
    canvas.drawCircle(x, y, size, myPaint);
}

}
