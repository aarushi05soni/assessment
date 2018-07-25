package model;

import util.TaxableCategory;

public class Tea extends HotBeverage {

    Tea(String name, int price, TaxableCategory tax) {
        this.name = name;
        this.price = price;
        this.tax=tax;
    }
    public String getDisplayName() {
        return "Hot.Tea."+this.name;
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
