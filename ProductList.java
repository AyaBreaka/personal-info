public class ProductList {
    public static void main(String[] args) {
        String[] products = {"Laptop", 
                             "Smartphone", 
                             "Headphones", 
                             "Smartwatch", 
                             "Tablet"};
        
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }
}
