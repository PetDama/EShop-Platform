public interface MyDeliveryHandler {
    void processDelivery(String location);
    void setNextHandler(MyDeliveryHandler nextHandler);
}
