public class AddToShoppingCartCommand implements MyCommand{
    private final MyShoppingCart myShoppingCart;
    private final MyProduct myProduct;

    public AddToShoppingCartCommand(MyShoppingCart myShoppingCart, MyProduct myProduct) {
        this.myShoppingCart = myShoppingCart;
        this.myProduct = myProduct;
    }

    @Override
    public void execute() {
        myShoppingCart.addItemToCart(myProduct);
    }
}
