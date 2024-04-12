package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args)
    {
        Date todaysDate = new Date(System.currentTimeMillis());
        ArrayList <MenuItem> items = new ArrayList<>();

        Menu myMenu = new Menu(todaysDate, items);

        MenuItem item1 = new MenuItem(10.00, "Steak", "Meat", false);
        MenuItem item2 = new MenuItem(20.00, "Prime Rib", "Meat", false);
        MenuItem item3 = new MenuItem(30.00, "Filet Mignon", "Meat", true);

        myMenu.addItems(item1);
        myMenu.addItems(item2);
        myMenu.addItems(item3);

        System.out.println("Hello, welcome to Kyle's restaurant!");

        myMenu.printMenu();

        myMenu.printItem(item2);

        myMenu.removeItems(item2);

        myMenu.printMenu();

        System.out.println("Goodbye!");

    }
}
