package Product;

public class Jeans implements PriceProduct {
    @Override
    public int getPrice() {
        return 180000;
    }

    @Override
    public String getName(){
        return "Jeans";
    }
}
