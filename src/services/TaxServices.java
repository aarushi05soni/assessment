package services;

import util.TaxableCategory;

import java.util.HashMap;
import java.util.Map;

public class TaxServices {
    private Map<TaxableCategory,Integer> tax=new HashMap<TaxableCategory,Integer>();
    TaxServices()
    {
        tax.put(TaxableCategory.COLD_COFFEE,18);
        tax.put(TaxableCategory.HOT_COFFEE,18);
        tax.put(TaxableCategory.COLD_DRINK,15);
        tax.put(TaxableCategory.TEA,5);
    }

    public Map<TaxableCategory, Integer> getTax() {
        return tax;
    }
}
