package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor>
{

    @Override
    public int compare(Flavor oneFlavor, Flavor anotherFlavor) {
        //return 0;
        return oneFlavor.getName().compareTo(anotherFlavor.getName());
    }
}
