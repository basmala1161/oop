import java.util.LinkedHashMap;
import java.util.Map;

public class Order {
    private int orderId;
    private String orderDate;
    private double totalPrice;
    private String orderLocation;
    private Map<Food, Integer> items;

    public Order(int orderId, String orderDate, String orderLocation) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderLocation = orderLocation;
        this.items = new LinkedHashMap<>();
    }

    public void addItem(Food food, int quantity) {
        items.put(food, items.getOrDefault(food, 0) + quantity);
        totalPrice += food.price * quantity;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder();
        orderDetails.append("Order ID: ").append(orderId)
                .append("\nDate: ").append(orderDate)
                .append("\nLocation: ").append(orderLocation)
                .append("\nTotal Price: ").append(totalPrice).append(" EGP\nItems:\n");

        for (Map.Entry<Food, Integer> entry : items.entrySet()) {
            Food food = entry.getKey();
            orderDetails.append("- ").append(food.name).append(" x").append(entry.getValue()).append("\n");
        }

        return orderDetails.toString();
    }
}

