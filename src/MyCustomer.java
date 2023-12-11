public class MyCustomer implements MyObserver{
    @Override
    public void notifyUser(String message) {
        System.out.println("Notification for customer: " + message);
    }
}
