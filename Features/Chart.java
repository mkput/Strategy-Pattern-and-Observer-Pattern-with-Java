package Features;

import java.util.ArrayList;

import Observers.Observer;
import Product.PriceProduct;

public class Chart {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private ArrayList<PriceProduct> products = new ArrayList<PriceProduct>();

    private int totalProduct;
    private int totalPrice;

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void addProduct(PriceProduct product){
        this.products.add(product);
        this.totalProduct++;

        setTotalPrice(product.getPrice());
        notifyAllObserver();
    }

    public int getTotalProduct(){
        return this.totalProduct;
    }

    public void notifyAllObserver(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setTotalPrice(int price){
        this.totalPrice += price;
    }

    public int getTotalPrice(){
        return this.totalPrice;
    }

    public void printAllProduct() {
        for (PriceProduct product : products) {
            System.out.println("Name    : " + product.getName());
            System.out.println("Price   : " + product.getPrice());
            System.out.println();
        }
    }
}
