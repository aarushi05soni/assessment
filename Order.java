import java.util.HashMap;
import java.util.*;

public class Order {
    public static  void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Item Catalogue:");
        Catalogue.printCatalogue();
        Map<Drink,Integer> items=new HashMap<>();

        System.out.println("Select items from catalogue:");
        String itemsOrdered=sc.next();
        List<String> itemsNo=new ArrayList<String>(Arrays.asList(itemsOrdered.split(",")));

        System.out.println("Order Summary");
        System.out.println("No      item         Quantity         Price");
        Map<Integer,Integer> rates=new HashMap<>();
        rates=Catalogue.getRate(itemsNo);
        int bill=OrderServices.getBill(rates);


    }
}
