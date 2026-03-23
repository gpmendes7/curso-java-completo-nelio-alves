package br.com.gpmendes7.lambda3.util;

import br.com.gpmendes7.lambda3.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
