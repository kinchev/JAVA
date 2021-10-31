package com.telerikacademy.oop.cosmetics.tests.models.shoppingcart;

import com.telerikacademy.oop.cosmetics.models.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Constructor_Tests {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void should_initializeNewListOfProducts_when_categoryCreated() {
        // Arrange, Act, Assert
        Assertions.assertNotNull(cart.getProducts());
    }

}
