package Product;

public class Shirt implements PriceProduct {
    @Override
    public int getPrice() {
        return 120000;
    }

    @Override
    public String getName(){
        return "Shirt";
    }
}
