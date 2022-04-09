package ru.geekbrains.HomeWork;

import java.awt.*;

public class Background extends GameCanvas {

    Background(MainCircles controller) {
        super(controller);
    }
        //Обновление фона
    public static void updateColorCanvas(GameCanvas canvas, float deltaTime) {
        Color color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        canvas.setBackground(color);
        }
}
