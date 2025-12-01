public class ProductList {
    public static void main(String[] args) {
        String[] products = {"Laptop", 
                             "Smartphone", 
                             "Headphones", 
                             "Smartwatch", 
                             "Tablet"};
        double[] prices = {1500.0, 
                           800.0, 
                           150.0, 
                           200.0, 
                           400.0};

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - Price: $" +   prices[i]);
        }
    }
} 
