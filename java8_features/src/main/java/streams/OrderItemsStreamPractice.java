package streams;

import java.util.Arrays;
import java.util.List;

public class OrderItemsStreamPractice {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(1, Arrays.asList(new OrderItem("Product A", 2), new OrderItem("Product B", 1))),
                new Order(2, Arrays.asList(new OrderItem("Product C", 5), new OrderItem("Product D", 3))),
                new Order(3, Arrays.asList(new OrderItem("Product E", 4)))
        );

        //Map the orders to a list of OrderItem objects. (Wanted Stream<OrderItem> not Stream<List<OrderItem>>)
        List<OrderItem> orderItemList = orders.stream()
                .flatMap(order -> order.getOrderItems().stream()).toList();
        System.out.println("Flattened Order List: ");
        orderItemList.forEach(System.out::println);

        System.out.println("********************");

        //Flatten all OrderItem objects into a single list and then map to a list of product names.
        List<String> productNames = orders.stream()
                .flatMap(order -> order.getOrderItems().stream())
                .map(OrderItem::getProductName).toList();
        System.out.println("Product Names: " + productNames);
    }
}
