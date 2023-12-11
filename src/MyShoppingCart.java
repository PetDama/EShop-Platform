import java.util.ArrayList;
import java.util.List;

public class MyShoppingCart {
    private final List<MyProduct> myProducts = new ArrayList<>();

    public void addItemToCart(MyProduct myProduct) {
        myProducts.add(myProduct);
        System.out.println("Item added to the shopping cart: " + myProduct.getName());
    }

    public void removeItemFromCart(MyProduct myProduct) {
        myProducts.remove(myProduct);
        System.out.println("Item removed from the shopping cart: " + myProduct.getName());
    }

    public void viewShoppingCart() {
        System.out.println("Items in the shopping cart:");
        for (MyProduct myProduct : myProducts) {
            System.out.println("- " + myProduct.getName() + " | Price: " + myProduct.getPrice());
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (MyProduct myProduct : myProducts) {
            totalPrice += myProduct.getPrice();
        }
        return totalPrice;
    }

    public void clearShoppingCart() {
        myProducts.clear();
        System.out.println("Shopping cart cleared.");
    }
}
