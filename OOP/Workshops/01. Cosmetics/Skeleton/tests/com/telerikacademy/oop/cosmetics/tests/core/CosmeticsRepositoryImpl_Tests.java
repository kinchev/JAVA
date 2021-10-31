package com.telerikacademy.oop.cosmetics.tests.core;

import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.tests.utils.TestData;
import com.telerikacademy.oop.cosmetics.tests.utils.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CosmeticsRepositoryImpl_Tests {

    private CosmeticsRepository repository;

    @BeforeEach
    public void setUp() {
        repository = TestUtilities.initializeRepository();
    }

    @Test
    public void constructor_should_initializeAllCollections() {
        // Arrange, Act, Assert
        Assertions.assertAll(
                () -> Assertions.assertNotNull(repository.getProducts()),
                () -> Assertions.assertNotNull(repository.getCategories())
        );
    }

    @Test
    public void constructor_should_initializeShoppingCart() {
        // Arrange, Act, Assert
        Assertions.assertNotNull(repository.getShoppingCart());
    }

    @Test
    public void getCategories_should_returnCopyOfCollection() {
        // Arrange
        repository.createCategory(TestData.CategoryData.VALID_NAME);
        repository.getCategories().clear();

        // Act, Assert
        Assertions.assertEquals(1, repository.getCategories().size());
    }

    @Test
    public void getProducts_should_returnCopyOfCollection() {
        // Arrange
        repository.createProduct(
                TestData.ProductData.VALID_NAME,
                TestData.ProductData.VALID_BRAND_NAME,
                2, GenderType.WOMEN);
        repository.getProducts().clear();

        // Act, Assert
        Assertions.assertEquals(1, repository.getProducts().size());
    }

    @Test
    public void categoryExists_should_returnTrue_whenCategoryExists() {
        // Arrange
        String categoryName = TestData.CategoryData.VALID_NAME;
        repository.createCategory(categoryName);

        // Act, Assert
        Assertions.assertTrue(repository.categoryExist(categoryName));
    }

    @Test
    public void productExists_should_returnTrue_whenProductExists() {
        // Arrange
        String productName = TestData.ProductData.VALID_NAME;
        repository.createProduct(
                TestData.ProductData.VALID_NAME,
                TestData.ProductData.VALID_BRAND_NAME,
                2, GenderType.WOMEN);

        // Act, Assert
        Assertions.assertTrue(repository.productExist(productName));
    }

    @Test
    public void createProduct_should_createSuccessfully_whenArgumentsAreValid() {
        // Arrange
        repository.createProduct(
                TestData.ProductData.VALID_NAME,
                TestData.ProductData.VALID_BRAND_NAME,
                2, GenderType.WOMEN);

        // Act, Assert
        Assertions.assertEquals(1, repository.getProducts().size());
    }

    @Test
    public void createCategory_should_createSuccessfully_whenArgumentsAreValid() {
        // Arrange
        repository.createCategory(TestData.CategoryData.VALID_NAME);

        // Act, Assert
        Assertions.assertEquals(1, repository.getCategories().size());
    }

    @Test
    public void findCategoryByName_should_returnCategory_ifExists() {
        // Arrange
        String categoryName = TestData.CategoryData.VALID_NAME;
        repository.createCategory(categoryName);

        // Act
        Category found = repository.findCategoryByName(categoryName);

        // Assert
        Assertions.assertEquals(found.getName(), categoryName);
    }

    @Test
    public void findCategoryByName_should_throwException_ifDoesNotExist() {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> repository.findCategoryByName("name"));
    }

    @Test
    public void findProductByName_should_returnCategory_ifExists() {
        // Arrange
        String productName = TestData.ProductData.VALID_NAME;
        repository.createProduct(
                TestData.ProductData.VALID_NAME,
                TestData.ProductData.VALID_BRAND_NAME,
                2, GenderType.WOMEN);

        // Act
        Product found = repository.findProductByName(productName);

        // Assert
        Assertions.assertEquals(found.getName(), productName);
    }

    @Test
    public void findProductByName_should_throwException_ifDoesNotExist() {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> repository.findProductByName("name"));
    }

}
