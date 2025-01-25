// Base class representing a general order
class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }
}

// Subclass representing a shipped order
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }
}

// Subclass representing a delivered order
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }
}

// Main class to test the order management system
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-01-20");
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-21", "TRK12345");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-22", "TRK67890", "2025-01-25");
        System.out.println(deliveredOrder.getOrderStatus());
    }
}

