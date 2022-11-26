package Product;

public class TShirt implements PriceProduct {
    @Override
    public int getPrice() {
        return 70000;
    }

    @Override
    public String getName(){
        return "T-Shirt";
    }
}
