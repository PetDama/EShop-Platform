public class MyInStoreDeliveryHandler implements MyDeliveryHandler{
    private MyDeliveryHandler nextHandler;

    @Override
    public void setNextHandler(MyDeliveryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processDelivery(String location) {
        if ("in-store".equals(location)) {
            System.out.println("Customer will pick up in-store");
        } else if (nextHandler != null) {
            nextHandler.processDelivery(location);
        }
    }
}
