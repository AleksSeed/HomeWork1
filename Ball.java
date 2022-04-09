package ru.geekbrains.HomeWork;

import java.awt.*;

public class Ball extends Sprite {
    private final Color color;
    private float vX;
    private float vY;

    Ball() {
        halfWidth = 10 + (float) (Math.random() * 30f); //Размер шаров
        halfHeight = halfWidth;
        color = new Color ((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255));  //RGB
        vX = (float)(100f + (Math.random() * 200f));
        vY = (float)(100f + (Math.random() * 200f));
    }

    @Override
    public void update(GameCanvas canvas, float deltaTime) {
        x += vX * deltaTime;
        y += vY * deltaTime;
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }

    @Override
    public void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHeight());
    }
}