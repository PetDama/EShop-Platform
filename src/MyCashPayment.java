public class MyCashPayment implements MyPaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " in cash");
    }
}
