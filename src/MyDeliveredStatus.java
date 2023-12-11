public class MyDeliveredStatus implements OrderStatus{
    @Override
    public void process() {
        System.out.println("Order has been delivered");
    }
}
