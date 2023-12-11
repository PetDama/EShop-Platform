public class MyPaymentPlan implements MyPaymentStrategy {
    private final int numberOfPayments;

    public MyPaymentPlan(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    @Override
    public void processPayment(double amount) {
        double paymentAmount = amount / numberOfPayments;
        System.out.println("Initiating payment in " + numberOfPayments + " installments.");

        for (int i = 1; i <= numberOfPayments; i++) {
            System.out.println("Processing installment " + i + ": " + paymentAmount);
        }
        System.out.println("Payment completed.");
    }
}
