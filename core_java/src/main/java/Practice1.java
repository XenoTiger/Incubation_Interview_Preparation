import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        Product product1 = new Product(1, "Samsung", 200.0, "Smartphone");
        Product product2 = new Product(2, "Nokia", 300.0, "Smartphone");
        Product product3 = new Product(3, "Samsung", 900.0, "TV");
        Product product4 = new Product(4, "Sony", 1200.0, "TV");

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        //Print the names of products whose price is below a certain threshold (e.g., 500).
        List<String> names = productList.stream()
                .filter(p -> p.getPrice() < 500).map(Product::getProductName).toList();
        names.forEach(System.out::println);

        //Create a new list containing products with a price reduction of 20%.
        List<Product> discountedProducts = productList.stream()
                .map(product -> new Product(
                        product.getId(),
                        product.getProductName(),
                        product.getPrice() * 0.8,
                        product.getCategory())).toList();

        discountedProducts.forEach(System.out::println);


        //Calculate the average price of all products.
        double average = productList.stream().mapToDouble(Product::getPrice).average().getAsDouble();
        System.out.println(average);

        //Find the product with the lowest price using Stream API.
        Product product = productList.stream().min(Comparator.comparing(Product::getPrice)).get();
        System.out.println("Lowest price product: "+ product);
    }
}
