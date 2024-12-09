package zad4;

import java.util.Comparator;

public class Product{
    int id;
    String name;
    Double price;

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "id= " + id + " price= " + price;
    }

}

class PriceIDComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        if(Double.compare(o1.price,o2.price)==0)
        {
            return Integer.compare(o1.id,o2.id);
        }
        return Double.compare(o1.price,o2.price);
    }
}
