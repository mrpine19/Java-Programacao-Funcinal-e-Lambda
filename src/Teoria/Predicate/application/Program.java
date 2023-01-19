package Teoria.Predicate.application;

import Teoria.Predicate.entiites.Product;
import Teoria.Predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    /*
        Predicate:

        public interface Predicate<T> {
            boolean test (T t);
        }
    */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.removeIf(p -> p.getPrice() >= 100);

        //list.removeIf(new ProductPredicate());

        //list.removeIf(Product::staticProductPredicate); //referencia com método estático

        //list.removeIf(Product::nonStaticProductPredicate); //referencia com método não estático

        //Predicate<Product> pred = p -> p.getPrice() >= 100.0; list.removeIf(pred); //expressão lambda declarada

        list.removeIf(p -> p.getPrice() >= 100.0); //expressão lambda não declarada

        for(Product p : list) {
            System.out.println(p);
        }
    }
}
