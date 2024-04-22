package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone>
{

    @Override
    public int compare(Cone aCone, Cone anotherCone)
    {
        return Double.compare(aCone.getCost(),anotherCone.getCost());
    }
}
