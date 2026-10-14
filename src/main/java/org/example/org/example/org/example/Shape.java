package org.example;

import java.awt.Graphics;

public abstract class Shape {
    protected int x, y, width, height;

    public Shape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Абстрактний метод згідно із завданням лаби
    public abstract void draw(Graphics g);
}