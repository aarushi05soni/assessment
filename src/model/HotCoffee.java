package model;

import util.TaxableCategory;

public class HotCoffee extends HotBeverage {
    HotCoffee(String name, int price, TaxableCategory tax) {
        this.name = name;
        this.price = price;
        this.tax=tax;
    }
    public String getDisplayName() {
        return "Hot.Coffee."+this.name;
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
