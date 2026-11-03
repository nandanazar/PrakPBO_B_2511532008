package shop.model;

import shop.shipping.Shippable;

public class PhysicalProduct extends Product implements Shippable {

    private int Weightgrams;

    public PhysicalProduct (String sku, String name, long price, int Weightgrams ) {
        super(sku, name, price);

        if (Weightgrams <= 0 ) {
            throw new IllegalArgumentException("Weight must not be 0 or negative"); 
        }

        this.Weightgrams = Weightgrams;

    }
    @Override
    public int getWeightGrams() {
        return Weightgrams;
    }

    public String category() {
        return "Fisik";
    }
    
}
