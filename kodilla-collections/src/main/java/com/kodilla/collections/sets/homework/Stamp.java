package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double height;
    private double width;
    private boolean isStamped;

    public Stamp(String name, double height, double width, boolean isStamped) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(height, stamp.height) == 0 && Double.compare(width, stamp.width) == 0 && isStamped == stamp.isStamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "isStamped=" + isStamped +
                ", width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
