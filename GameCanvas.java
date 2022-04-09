package ru.geekbrains.HomeWork;

import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {
    private long lastFrameTime;
    private MainCircles controller;

    GameCanvas(MainCircles controller) {
        this.controller = controller;
        lastFrameTime = System.nanoTime();
    }

     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        float deltaTime = (currentTime - lastFrameTime) * 0.000000001f;
        lastFrameTime = currentTime;
        controller.onDrawCanvas(this, g, deltaTime);
        try {
            Thread.sleep(17);   //Задержка в 60 кадров/сек.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        repaint();
    }

    public int getLeft() { return 0; }
    public int getRight() { return getWidth() - 1; }
    public int getTop() { return 0; }
    public int getBottom() { return getHeight() - 1; }


}