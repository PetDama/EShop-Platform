public class Main {
    public static void main(String[] args) {
        MyECommercePlatform myECommercePlatform = MyECommercePlatform.getInstance();

        MyShoppingCart myShoppingCart = new MyShoppingCart();

        MyProduct laptop = new MyProduct("Laptop", "Electronics", 10, 999.99);
        MyProduct book = new MyProduct("Programming Book", "Books", 20, 49.99);

        MyCommand addToCartCommand1 = new AddToShoppingCartCommand(myShoppingCart, laptop);
        MyCommand addToCartCommand2 = new AddToShoppingCartCommand(myShoppingCart, book);

        addToCartCommand1.execute();
        addToCartCommand2.execute();

        myShoppingCart.viewShoppingCart();

        double totalPrice = myShoppingCart.calculateTotalPrice();
        System.out.println("Total Price: " + totalPrice);

        MyOrder myOrder = new MyOrder();

        OrderStatus processingStatus = new MyProcessingStatus();
        myOrder.setStatus(processingStatus);

        myOrder.fulfillOrder();

        MyPaymentPlan myPaymentPlan = new MyPaymentPlan(3);

        myPaymentPlan.processPayment(totalPrice);

        MyObserver customer = new MyCustomer();

        customer.notifyUser("Your order has been processed and is on its way.");

        MyDeliveryHandler locationHandler = new MyLocationDeliveryHandler();
        MyDeliveryHandler pickupPointHandler = new MyPickupPointDeliveryHandler();
        MyDeliveryHandler inStoreHandler = new MyInStoreDeliveryHandler();

        locationHandler.setNextHandler(pickupPointHandler);
        pickupPointHandler.setNextHandler(inStoreHandler);

        locationHandler.processDelivery("at a location");

        MySeller individualSeller = new MyIndividualSeller();
        MySeller corporateSeller = new MyCorporateSeller();

        individualSeller.register();
        corporateSeller.register();

        individualSeller.addProduct(laptop);
        corporateSeller.addProduct(book);
    }
}