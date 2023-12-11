public class MyLocationDeliveryHandler implements MyDeliveryHandler{
    private MyDeliveryHandler nextHandler;

    @Override
    public void setNextHandler(MyDeliveryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processDelivery(String location) {
        if ("at a location".equals(location)) {
            System.out.println("Delivering at a specified location");
        } else if (nextHandler != null) {
            nextHandler.processDelivery(location);
        }
    }
}
