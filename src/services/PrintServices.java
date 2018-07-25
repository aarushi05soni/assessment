package services;

import model.Beverage;

import java.util.List;
import java.util.Map;
import java.util.*;
public class PrintServices {
    InputService inputService=new InputService();
    List<Integer> itemNo=new LinkedList<>();
    BillingServices billingServices=new BillingServices();
    public  void printCatalogue(List<Beverage> priceList)
    {
        for(int i=0;i<priceList.size();i++)
        {
            Beverage beverage=priceList.get(i);
            System.out.println((i+1)+".   "+beverage.getDisplayName()+"     -Rs."+beverage.getPrice());
        }
        getOrder(priceList);
    }
    public void getOrder(List<Beverage> priceList)
    {
        System.out.println("Select items from catalogue:");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        itemNo=inputService.getItemNumber(input);
        int quantity[]=billingServices.getQuantity(itemNo);
        int totalAmount=billingServices.getTotalAmount(itemNo,priceList,quantity);
        long totalTax=billingServices.getTax(itemNo,priceList);
        getOrderSummary(itemNo,priceList,totalAmount,totalTax,quantity);
    }
    public void getOrderSummary(List<Integer> itemNo,List<Beverage> priceList,int totalAmount,long totalTax,int[] quantity)
    {
        System.out.println("Order Summary:");
        System.out.println("---------------------------");
        System.out.format("%5s%10s%10s%10s","No.","Item","Quantity","Price");
        System.out.println();
        for(int i=0;i<itemNo.size();i++)
        {
            Beverage beverage=priceList.get(itemNo.get(i));
            System.out.format("%5s%10s%10s%10s", i + 1, beverage.getName(), quantity[itemNo.get(i)], beverage.getPrice()*quantity[itemNo.get(i)]);
            System.out.println();
         }
        System.out.println();
        System.out.println("----------------------------");
        System.out.format("%10s%25s","Total",totalAmount-totalTax);
        System.out.println();
        System.out.format("%10s%25s","Taxes",totalTax);
        System.out.println();
        System.out.println("----------------------------");
        System.out.format("%10s%25s","Net",totalAmount);
    }
}
