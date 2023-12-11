public class MyCorporateSeller implements MySeller{
    @Override
    public void register() {
        System.out.println("Corporate Seller Registered");
    }

    @Override
    public void addProduct(MyProduct product) {
        System.out.println("Product added by Corporate Seller");
    }
}
