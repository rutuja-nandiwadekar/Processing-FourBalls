package com.tw;

import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 960;
    public static final int DIAMETER = 30;
    int width = 1;

    public static void main(String[] args) {
        PApplet.main("com.tw.FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(width, HEIGHT / 5, DIAMETER, DIAMETER);

        ellipse(width * 2, (HEIGHT * 2) / 5, DIAMETER, DIAMETER);

        ellipse(width * 3, (HEIGHT * 3) / 5, DIAMETER, DIAMETER);

        ellipse(width * 4, (HEIGHT * 4) / 5, DIAMETER, DIAMETER);

        width++;
    }
}
