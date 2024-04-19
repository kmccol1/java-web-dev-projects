package org.example;

public class SmartPhone extends Computer
{
    private double storageSize;

    public SmartPhone(String make, String model, double size)
    {
        super();
        this.storageSize = size;
    }

    public SmartPhone()
    {
        super();
        this.storageSize = 0;
    }

    public String swipe()
    {
        return "Swiped once.";
    }

    public double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }
}
