public class MyProcessingStatus implements OrderStatus{
    @Override
    public void process() {
        System.out.println("Order is being processed");
    }
}
