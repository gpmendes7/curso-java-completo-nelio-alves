package br.com.gpmendes7.lambda4.util;

import br.com.gpmendes7.lambda4.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
