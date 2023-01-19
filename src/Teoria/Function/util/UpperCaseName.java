package Teoria.Function.util;

import Teoria.Function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> { //Primeiro entrada, depois saída
    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }

}
