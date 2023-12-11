public class MyCardPayment  implements MyPaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " with a card");
    }
}
