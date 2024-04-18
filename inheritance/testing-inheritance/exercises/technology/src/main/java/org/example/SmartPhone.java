package org.example;

public class SmartPhone extends Computer
{
    private double storageSize;

    public SmartPhone(String make, String model, double size)
    {
        super();
        this.storageSize = size;
    }

    public void swipe()
    {
        System.out.println("Swiped once.");
    }
}
