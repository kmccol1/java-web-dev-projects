package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItems(MenuItem anItem)
    {
        if (this.getItems().contains(anItem))
        {
            System.out.println("Error: Item already exists.");
        }
        else
            this.items.add(anItem);
    }

    public void removeItems(MenuItem anItem)
    {
        this.items.remove(anItem);
    }

    public boolean isNew(MenuItem anItem)
    {
        return this.items.get(this.items.indexOf(anItem)).getIsNew();
    }

    public void printItem(MenuItem anItem)
    {
        System.out.println("Price: " + anItem.getPrice() +
                "\nDescription: " +
                anItem.getDescription() +
                "\nCategory: " + anItem.getCategory());
    }

    public void printMenu()
    {
        System.out.println("Printing the ENTIRE menu...");
        for (MenuItem anItem : items)
        {
            System.out.println("Price: " + anItem.getPrice() +
                    "\nDescription: " +
                    anItem.getDescription() +
                    "\nCategory: " + anItem.getCategory());
        }
        System.out.println("Done.");
    }
}


