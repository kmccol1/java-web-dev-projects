package org.launchcode;

import java.time.LocalDateTime;

public class DVD extends BaseDisc implements OpticalDisc
{
    // TODO: Implement your custom interface.
    public DVD (String name, double length, String type, double capacity, String producer, LocalDateTime year, String fmt)
    {
        super(name, length, type, capacity, producer, year, fmt);
    }
    @Override
    public void spinDisc()
    {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");    }

    @Override
    public void storeData()
    {
        System.out.println("Storing a large amount of data....Done.");
    }

    @Override
    public void writeData()
    {
        System.out.println("Writing data....Done.");
    }

    //readData()' in 'org.launchcode.CD' clashes with 'readData()' in 'org.launchcode.OpticalDisc'; attempting to assign weaker access privileges ('package-private'); was 'public
    @Override
    public void readData()
    {
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");    }

    @Override
    public void getStatus()
    {
        System.out.println("Status: Activated.");
    }

    @Override
    public void rewind()
    {
        System.out.println("Rewinding....Done.");

    }

    @Override
    public void fastForward()
    {
        System.out.println("Fast forwarding....Done.");
    }

    @Override
    public void play()
    {
        System.out.println("Playing....Done.");
    }

    @Override
    public void pause()
    {
        System.out.println("Paused.");
    }

    @Override
    public void eject()
    {
        System.out.println("Ejecting CD....Done.");
    }

    @Override
    public void stop()
    {
        System.out.println("Stopping....Done.");
    }

    @Override
    public void skip()
    {
        System.out.println("Skipping....Done.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
