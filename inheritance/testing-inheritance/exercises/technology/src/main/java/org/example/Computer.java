package org.example;

public class Computer
{
    private String make;
    private String model;
    private String os;

    public Computer()
    {
        this.make = "Unknown";
        this.model = "Unknown";
        this.os = "TBD...";
    }

    public Computer(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public String makeSounds()
    {
        return "Beeep!";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
