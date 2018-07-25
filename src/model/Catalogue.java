package model;
import services.*;

import java.util.LinkedList;
import java.util.List;

public class Catalogue {
    List<Beverage> beverageList=new LinkedList<Beverage>();
    public Catalogue(List<Beverage> beverageList)
    {
        this.beverageList=beverageList;
        PrintServices printServices=new PrintServices();
        printServices.printCatalogue(beverageList);
    }


}
