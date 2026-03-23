package br.com.gpmendes7.lambda2.util;

import br.com.gpmendes7.lambda2.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }

}
