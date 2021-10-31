package com.telerikacademy.oop.cosmetics.tests.models.product;

import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.tests.utils.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Constructor_Tests {

    @ParameterizedTest(name = "with name length {0}")
    @ValueSource(ints = {Product.NAME_MIN_LENGTH - 1, Product.NAME_MAX_LENGTH + 1})
    public void should_throwException_when_nameLengthOutOfBounds(int nameLength) {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Product("x".repeat(nameLength), TestData.ProductData.VALID_BRAND_NAME, 10, GenderType.MEN));
    }

    @ParameterizedTest(name = "with brand name length {0}")
    @ValueSource(ints = {Product.BRAND_MIN_LENGTH - 1, Product.BRAND_MAX_LENGTH + 1})
    public void should_throwException_when_brandNameLengthOutOfBounds(int brandNameLength) {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Product(TestData.ProductData.VALID_NAME, "x".repeat(brandNameLength), 10, GenderType.MEN));
    }

    @Test
    public void should_throwException_when_priceIsNegative() {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Product(TestData.ProductData.VALID_NAME,
                        TestData.ProductData.VALID_BRAND_NAME,
                        -1, GenderType.MEN));
    }

    @Test
    public void should_createProduct_whenValidValuesArePassed() {
        // Arrange, Act, Assert
        Assertions.assertDoesNotThrow(() -> new Product(TestData.ProductData.VALID_NAME,
                TestData.ProductData.VALID_BRAND_NAME,
                10, GenderType.MEN));
    }

}