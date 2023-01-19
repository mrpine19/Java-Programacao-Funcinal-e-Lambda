package Teoria.Consumer.application;

import Teoria.Consumer.entities.Product;
import Teoria.Consumer.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    /*
        Consumer:

        public interface Consumer<T> {
            void accept(T t);
        }
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //list.forEach(new PriceUpdate()); //IMPLEMENTAÇÃO DA INTERFACE

        //list.forEach(Product::staticPriceUpdate);//IMPLEMENTAÇÃO COM MÉTODO ESTÁTICO

        //list.forEach(Product::nonStaticPriceUpdate);//IMPLEMENTAÇÃO COM MÉTODO NÃO ESTÁTICO

        //Consumer<Product> consumer = c -> c.setPrice(c.getPrice() * 1.1);//IMPLEMENTAÇÃO COM EXPRESSÃO LAMBDA DECLARADA
        //list.forEach(consumer);

        list.forEach(c -> c.setPrice(c.getPrice() * 1.1)); //IMPLEMENTAÇÃO COM EXPRESSÃO LAMBDA NÃO DECLARADA
        list.forEach(System.out::println);
    }
}
