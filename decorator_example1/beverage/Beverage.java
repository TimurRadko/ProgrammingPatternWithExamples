package com.timurradko.decorator_example1.beverage;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    protected Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
