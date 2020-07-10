package com.shiva.service;


import java.math.BigDecimal;
import java.util.Map;

import com.shiva.exception.NotEnoughProductsInStockException;
import com.shiva.model.Product;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
