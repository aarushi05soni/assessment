package model;

import util.TaxableCategory;

abstract public class Beverage {
    String name;
    long price;
    String displayName;
    TaxableCategory tax;
    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public TaxableCategory getTax() {
        return tax;
    }

    public long getPrice() {
        return price;
    }
}
