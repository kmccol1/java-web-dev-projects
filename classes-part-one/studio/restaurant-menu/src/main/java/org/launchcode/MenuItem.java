package org.launchcode;

public class MenuItem
{
    private String itemName;
    private double price;
    private String category;

    private String description;
    private boolean isNew;

    public MenuItem(String itemName, double price, String category, String description, boolean isNew) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
    }

    public String getItemName() {
        return this.itemName;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
