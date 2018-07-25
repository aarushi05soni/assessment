package services;

import model.Beverage;
import model.Catalogue;

import java.util.Arrays;
import java.util.List;

public class BillingServices {
    Catalogue catalogue;
    int[] quantity=new int[20];

    TaxServices taxServices=new TaxServices();
    public int getTotalAmount(List<Integer> itemOrdered, List<Beverage> priceList,int[] quantity)
    {
        int totalAmount=0;
        for(int i=0;i<itemOrdered.size();i++)
        {
            Beverage beverage=priceList.get(itemOrdered.get(i));
            totalAmount+=(beverage.getPrice()*quantity[itemOrdered.get(i)])+(taxServices.getTax().get(beverage.getTax())*beverage.getPrice()/100);
        }
        return totalAmount;
    }
    public int[] getQuantity(List<Integer> itemNo)
    {
        for(int i=0;i<quantity.length;i++)
        {
            quantity[i]=0;
        }
        for(int i=0;i<itemNo.size();i++)
        {
            int j=itemNo.get(i);
            quantity[j]++;

        }
        return quantity;
    }
    public long getTax(List<Integer> itemOrdered, List<Beverage> priceList)
    {
        long totalTax=0;
        for(int i=0;i<itemOrdered.size();i++)
        {
            Beverage beverage=priceList.get(itemOrdered.get(i));
            totalTax=totalTax+(taxServices.getTax().get(beverage.getTax())*beverage.getPrice()/100);
        }
        return totalTax;
    }

}
