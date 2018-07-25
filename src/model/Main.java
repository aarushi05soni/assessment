package model;
import model.*;
import util.TaxableCategory;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static  void main(String args[])
    {
        List<Beverage> beverageList=new LinkedList<>();
        beverageList.add(new ColdCoffee("Oreo",110,TaxableCategory.COLD_COFFEE));
        beverageList.add(new ColdCoffee("Frappe",125,TaxableCategory.COLD_COFFEE));

        beverageList.add(new ColdDrink("Pepsi",45,TaxableCategory.COLD_DRINK));
        beverageList.add(new ColdDrink("Coca cola",45,TaxableCategory.COLD_DRINK));
        beverageList.add(new ColdDrink("Mirinda",45,TaxableCategory.COLD_DRINK));
        beverageList.add(new HotCoffee("Latte",40,TaxableCategory.HOT_COFFEE));
        beverageList.add(new HotCoffee("Cappucino",50,TaxableCategory.HOT_COFFEE));
        beverageList.add(new HotCoffee("Espresso",30,TaxableCategory.HOT_COFFEE));
        beverageList.add(new Tea("Masala",15,TaxableCategory.TEA));
        beverageList.add(new Tea("Black",10,TaxableCategory.TEA));
        Catalogue catalogue=new Catalogue(beverageList);
    }
}
