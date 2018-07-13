import java.util.*;
public class Catalogue {
    private Drink drink=new Drink();
    private int price;
    private int serialNo;
    static int i=1;
    Catalogue(int serialNo,Drink drink,int price)
    {
        this.serialNo=serialNo;
        this.drink=drink;
        this.price=price;
    }
    public int  getSerialNo()
    {
        return serialNo;
    }
    public Drink getDrink()
    {
        return drink;
    }
    public int getPrice()
    {
        return price;
    }
    static public void printCatalogue()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+". "+DrinkType.valueOf(""));
        }
    }
    static public Map<Integer,Integer> getRate(List<String> itemsNo)
    {
        int rate=0;
        int quantity=1;
        Map<Integer,Integer> rates=new HashMap<>();
        for(int j=0;j<itemsNo.size();j++)
        {
            if(itemsNo.get(j).equals()) {
                rates.put(rate, quantity);
            }
        }
        return rates;
    }
}
