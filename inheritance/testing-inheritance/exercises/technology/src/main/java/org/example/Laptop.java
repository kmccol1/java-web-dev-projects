package org.example;

public class Laptop extends Computer
{
    private double displaySize;

    public Laptop(String make, String model, double size)
    {
        super();
        this.displaySize = size;
    }

    public Laptop()
    {
        this.displaySize = 0;
    }

    public void type()
    {
        System.out.println("asdfgdgfdfjlkg");
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }
}
