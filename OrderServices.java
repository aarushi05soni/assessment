import java.util.*;
public class OrderServices {
    List<Order> orders=new ArrayList<>();
    OrderServices(List<Order> orders)
    {
        this.orders=orders;
    }

    static public int getBill(Map<Integer,Integer> rates)
    {
        int totalAmount=0;
        for(Map.Entry<Integer,Integer> entry:rates.entrySet())
        {
            totalAmount+=(entry.getKey()*entry.getValue());
        }

        return totalAmount;
    }
}
