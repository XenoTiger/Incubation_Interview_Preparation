package streams;

import java.util.List;

public class Order {

    private final Integer orderId;
    private final List<OrderItem> orderItems;

    public Order(Integer orderId, List<OrderItem> orderItems) {
        this.orderId = orderId;
        this.orderItems = orderItems;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderItems=" + orderItems +
                '}';
    }
}
