import java.util.Scanner;

import Features.Chart;
import Observers.AddToChart;
import Observers.TotalProductView;
import Product.Jeans;
import Product.Shirt;
import Product.TShirt;

public class App {
    private static Scanner scanner;
    
    public static void main(String[] args) {
        Chart chart = new Chart();
        
        new AddToChart(chart);
        new TotalProductView(chart);
        
        System.out.println("=====Welcome To OOTD's Store=====");
        
        while (true) {                    
            System.out.println("===Available Product");
            System.out.println("1. Shirt");
            System.out.println("2. T-Shirt");
            System.out.println("3. Jeans");
            
            System.out.print("Your Choice : ");
            scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if (userInput == 1){
                chart.addProduct(new Shirt());
            } else if (userInput == 2) {
                chart.addProduct(new TShirt());
            } else if (userInput == 3) {
                chart.addProduct(new Jeans());
            }

            System.out.print("Continue Shopping ? (y/n) ");
            scanner = new Scanner(System.in);
            String isContinueInput = scanner.next();

            if (!isContinueInput.equals("y")){
                break;
            }
        }

        System.out.println("===Your Chart");
        chart.printAllProduct();
        System.out.println("______________________________");
        System.out.println("Total Payment : " + chart.getTotalPrice());
    }
}

