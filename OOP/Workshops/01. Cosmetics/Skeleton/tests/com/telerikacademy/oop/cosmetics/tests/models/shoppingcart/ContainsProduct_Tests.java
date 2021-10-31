package com.telerikacademy.oop.cosmetics.tests.models.shoppingcart;

import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.models.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainsProduct_Tests {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void should_returnTrue_when_productFound() {
        // Arrange, Act
        Product productToAdd = new Product("name", "brand", 10, GenderType.MEN);
        cart.addProduct(productToAdd);

        // Act
        boolean isFound = cart.containsProduct(new Product("name", "brand", 10, GenderType.MEN));

        //Assert
        Assertions.assertTrue(isFound);
    }

    @Test
    public void should_returnFalse_when_productNotFound() {
        // Arrange, Act
        boolean isFound = cart.containsProduct(new Product("name", "brand", 10, GenderType.MEN));

        //Assert
        Assertions.assertFalse(isFound);
    }

}
