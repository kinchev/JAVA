package com.telerikacademy.oop.cosmetics.tests.models.category;

import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.tests.utils.TestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class Constructor_Tests {

    @ParameterizedTest(name = "with name length {0}")
    @ValueSource(ints = {Category.NAME_MIN_LENGTH - 1, Category.NAME_MAX_LENGTH + 1})
    public void should_throwException_when_nameLengthOutOfBounds(int nameLength) {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Category("x".repeat(nameLength)));
    }

    @Test
    public void should_createCategory_when_nameIsValid() {
        // Arrange, Act, Assert
        Assertions.assertDoesNotThrow(() -> new Category(TestData.CategoryData.VALID_NAME));
    }

    @Test
    public void should_initializeNewListOfProducts_when_categoryIsCreated() {
        // Arrange, Act
        Category category = new Category(TestData.CategoryData.VALID_NAME);

        // Assert
        Assertions.assertNotNull(category.getProducts());
    }

}
