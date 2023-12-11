public class MyOrder {
    private OrderStatus orderStatus;

    public void fulfillOrder() {
        if (orderStatus != null) {
            orderStatus.process();
        } else {
            System.out.println("Order is in an invalid state.");
        }
    }

    public void setStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
