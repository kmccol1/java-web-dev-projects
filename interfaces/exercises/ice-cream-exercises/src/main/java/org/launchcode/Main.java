package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator conesComparator = new ConeComparator();
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nBefore sorting flavors: ");
        for ( Flavor aFlavor : flavors)
        {
            System.out.println(aFlavor.getName());
        }
        flavors.sort(comparator);
        System.out.println("\nAfter sorting flavors: ");
        for ( Flavor aFlavor : flavors)
        {
            System.out.println(aFlavor.getName());
        }

        System.out.println("\nBefore sorting cones: ");
        for ( Cone aCone : cones)
        {
            System.out.println(aCone.getName() + ": $" + aCone.getCost());
        }
        cones.sort(conesComparator);
        System.out.println("\nAfter sorting cones: ");
        for ( Cone aCone : cones)
        {
            System.out.println(aCone.getName() + ": $" + aCone.getCost());
        }
    }
}