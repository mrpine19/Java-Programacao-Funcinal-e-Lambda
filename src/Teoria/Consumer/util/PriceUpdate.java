package Teoria.Consumer.util;

import Teoria.Consumer.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        //O MÉTODO DEVE ATUALIZAR O PREÇO EM 10%
        product.setPrice(product.getPrice() * 1.1);
    }
}
