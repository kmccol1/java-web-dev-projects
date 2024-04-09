package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu
{
    private ArrayList<MenuItem> menu;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menu, Date lastUpdated) {
        this.menu = menu;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenu() {
        return this.menu;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
