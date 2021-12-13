package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private int height;
    private int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    public double getField() {
        double field = ((height * base) / 2);
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && base == triangle.base && shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, height, base);
    }
}
