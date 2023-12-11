public class MyShippedStatus implements OrderStatus{
    @Override
    public void process() {
        System.out.println("Order has been shipped");
    }
}
