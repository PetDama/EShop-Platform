public class MyIndividualSeller implements MySeller{
    @Override
    public void register() {
        System.out.println("Individual Seller Registered");
    }

    @Override
    public void addProduct(MyProduct product) {
        System.out.println("Product added by Individual Seller");
    }
}
