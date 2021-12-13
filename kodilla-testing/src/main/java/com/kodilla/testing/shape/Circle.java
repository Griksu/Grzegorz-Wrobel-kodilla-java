package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getRadius() {
        return radius;
    }

    public double getField() {
        double field = (3.14 * (radius * radius));
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius && shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, radius);
    }
}
