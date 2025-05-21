package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CartItemsStreamsPractice {
    public static void main(String[] args) {
        List<CartItem> cart = Arrays.asList(
                new CartItem("Laptop", 1, 1200.00),
                new CartItem("Smartphone", 2, 800.00),
                new CartItem("Tablet", 0, 300.00),
                new CartItem("Headphones", 3, 150.00),
                new CartItem("Charger", 0, 20.00)
        );

        //Calculate the total value of all items in the cart. (Use mapToDouble())
        double cartValue = cart.stream().mapToDouble(CartItem::getPrice).sum();
        System.out.println(cartValue);

        System.out.println("********************");

        //Find the item with the highest total price (quantity * price). (Use Collectors.comparingDouble())
        Optional<CartItem> item = cart.stream().max(Comparator.comparingDouble(
                product -> product.getQuantity() * product.getPrice()
        ));
        System.out.println("Item with the highest price is " + item.orElse(null));

        System.out.println("********************");

        //Filter out items with a quantity of 0 and print the remaining cart.
        List<CartItem> items = cart.stream()
                .filter(e -> e.getQuantity() > 0).toList();
        items.forEach(System.out::println);

    }
}
