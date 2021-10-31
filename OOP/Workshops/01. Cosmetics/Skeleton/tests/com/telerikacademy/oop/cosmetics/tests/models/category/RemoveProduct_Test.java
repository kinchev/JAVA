package com.telerikacademy.oop.cosmetics.tests.models.category;

import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveProduct_Test {

    @Test
    public void should_removeProduct_when_productIsValid() {
        // Arrange, Act
        Category category = new Category("name");
        category.addProduct(new Product("name", "brand", 10, GenderType.MEN));

        // Act, Assert
        Assertions.assertAll(
                () -> Assertions.assertDoesNotThrow(() -> category.removeProduct(new Product("name", "brand", 10, GenderType.MEN))),
                () -> Assertions.assertEquals(0, category.getProducts().size())
        );
    }

    @Test
    public void should_throwException_when_productNotFound() {
        // Arrange, Act
        Category category = new Category("name");
        Product productToRemove = new Product("name", "brand", 10, GenderType.MEN);

        // Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> category.removeProduct(productToRemove));
    }

}
