package com.telerikacademy.oop.cosmetics.tests.models.shoppingcart;

import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.models.ShoppingCart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveProduct_Tests {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void should_removeProduct_when_productInCart() {
        // Arrange
        cart.addProduct(new Product("name", "brand", 10, GenderType.MEN));
        cart.addProduct(new Product("name_1", "brand_1", 22, GenderType.WOMEN));

        // Act
        cart.removeProduct(new Product("name", "brand", 10, GenderType.MEN));

        //Assert
        Assertions.assertEquals(1, cart.getProducts().size());
    }

    @Test
    public void should_throwException_when_productNotInCart() {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> cart.removeProduct(new Product("name", "brand", 10, GenderType.MEN)));
    }

}
