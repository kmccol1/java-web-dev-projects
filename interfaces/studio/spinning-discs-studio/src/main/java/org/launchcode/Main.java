package org.launchcode;
import java.time.LocalDateTime;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        LocalDateTime chuckDate = LocalDateTime.of(1957, 05, 01, 01, 01);
        LocalDateTime shiningDate = LocalDateTime.of(1980, 5, 23, 01,01);

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("After School Session", 33.16, "Rock and roll", 15, "Leonard Chess and Phil Chess", chuckDate, "LP"); //cd and dvd are abstract, cannot be instantiated.
        DVD myDVD = new DVD("The Shining", 144, "Horror", 150, "Stanley Kubrick", shiningDate, ".mp4");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.readData();
        myDVD.readData();

        myCD.writeData();
        myDVD.writeData();

        myCD.getStatus();
        myDVD.getStatus();
    }
}