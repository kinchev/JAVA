package com.telerikacademy.oop.cosmetics.tests.models.category;

import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.tests.utils.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddProduct_Tests {

    @Test
    public void should_addProduct_when_productIsValid() {
        // Arrange
        Category category = new Category("test");
        Product productToAdd = new Product(TestData.ProductData.VALID_NAME, TestData.ProductData.VALID_BRAND_NAME, 10, GenderType.MEN);

        // Act, Assert
        Assertions.assertAll(
                () -> Assertions.assertDoesNotThrow(() -> category.addProduct(productToAdd)),
                () -> Assertions.assertEquals(1, category.getProducts().size())
        );
    }

}

