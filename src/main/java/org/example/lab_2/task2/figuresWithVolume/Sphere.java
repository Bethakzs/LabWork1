package org.example.lab_2.task2.figuresWithVolume;

import org.example.lab_2.task2.ShapeWithVolume;

public class Sphere extends ShapeWithVolume {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.round(4.0 / 3.0 * Math.PI * Math.pow(radius, 3) * 10.0) / 10.0;
    }
}