package com.tw;

import processing.core.PApplet;

public class FourBallsOopsAttempt extends PApplet {
    class Ball{
        private static final int diameter = 30;
        private int height;
        private int speed;
        private int position;

        public Ball(int height, int speed, int position) {
            this.height = height;
            this.speed = speed;
            this.position = position;
        }
    }

    public static final int HEIGHT = 960;
    public static final int WIDTH = 1280;
    public static final int POSITION = 1;
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(HEIGHT / 5, 1, POSITION);
        ball2 = new Ball((HEIGHT * 2) / 5, 2, POSITION);
        ball3 = new Ball((HEIGHT * 3) / 5, 3, POSITION);
        ball4 = new Ball((HEIGHT * 4) / 5, 4, POSITION);
    }

    @Override
    public void draw() {
        drawCircle(ball1);
        drawCircle(ball2);
        drawCircle(ball3);
        drawCircle(ball4);
    }

    private void drawCircle(Ball ball) {
        ellipse(ball.position, ball.height, Ball.diameter, Ball.diameter);
        ball.position += ball.speed;
    }

    public static void main(String[] args) {
        PApplet.main("com.tw.FourBallsOopsAttempt", args);
    }

}
