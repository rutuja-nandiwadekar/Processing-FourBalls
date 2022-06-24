package com.tw;

import processing.core.PApplet;


public class Demo extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DISMETER = 10;

    int x =0;

    public static void main(String[] args){PApplet.main("com.tw.Demo", args);}

    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup(){
    }
    
    @Override
    public void draw(){
        //paintWhite();
        drawCircle();
    }

    private void drawCircle(){
        ellipse(x, mouseY, DISMETER, DIAMETER);
        x++;
    }

    private void paintWhite(){
        background(255);
    }
    




}
