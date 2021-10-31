package com.telerikacademy.oop.cosmetics.tests.models.shoppingcart;

import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.models.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddProduct_Tests {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void should_addProduct_when_productIsValid() {
        // Arrange, Act
        Product productToAdd = new Product("name", "brand", 10, GenderType.MEN);

        // Act
        cart.addProduct(productToAdd);

        //Assert
        Assertions.assertEquals(1, cart.getProducts().size());
    }

}
