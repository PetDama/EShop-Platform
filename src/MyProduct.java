public class MyProduct {
    private String name;
    private String category;
    private int availableStock;
    private double price;

    public MyProduct(String name, String category, int availableStock, double price) {
        this.name = name;
        this.category = category;
        this.availableStock = availableStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
