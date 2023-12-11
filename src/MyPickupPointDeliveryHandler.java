public class MyPickupPointDeliveryHandler implements MyDeliveryHandler {
    private MyDeliveryHandler nextHandler;

    @Override
    public void setNextHandler(MyDeliveryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processDelivery(String location) {
        if ("pickup point".equals(location)) {
            System.out.println("Delivering to a pickup point");
        } else if (nextHandler != null) {
            nextHandler.processDelivery(location);
        }
    }
}
