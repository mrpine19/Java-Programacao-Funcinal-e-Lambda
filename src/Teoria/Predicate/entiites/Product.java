package Teoria.Predicate.entiites;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return name + ", R$ " + String.format("%.2f", price);
    }
}
