package Teoria.Function.application;

import Teoria.Function.entities.Product;
import Teoria.Function.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    /*
        Function:

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

        //a função map (não é a estrutura de dados Map) é uma função que aplica uma função a todos elementos de uma stream

        List<String> names;

        //names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); //IMPLEMENTAÇÃO COM INTERFACE

        //names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); //IMPLEMENTAÇÃO COM MÉTODO ESTÁTICO

        //names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); //IMPLEMENTAÇÃO COM NÃO MÉTODO ESTÁTICO

        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //names = list.stream().map(func).collect(Collectors.toList()); //IMPLEMENTAÇÃO COM LAMBDA DECLARADA

        names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); //IMPLEMENTAÇÃO COM LAMBDA NÃO DECLARADA

        names.forEach(System.out::println);
    }
}
