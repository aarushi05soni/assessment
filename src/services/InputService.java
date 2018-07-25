package services;

import java.util.LinkedList;
import java.util.List;

public class InputService {
    List<Integer> itemNo=new LinkedList<>();
    public List<Integer> getItemNumber(String input)
    {

        int i = 0;

        while (i < input.length()) {
            String itemNumber = "";
            while (i < input.length() && input.charAt(i) != ',') {
                itemNumber = itemNumber + input.charAt(i);
                i++;
            }
            i++;
            itemNo.add(Integer.parseInt(itemNumber) - 1);
        }
        return itemNo;
    }
}
