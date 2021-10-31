package com.telerikacademy.oop.cosmetics.core.contracts;

import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.models.ShoppingCart;

import java.util.List;

public interface CosmeticsRepository {

    ShoppingCart getShoppingCart();

    List<Category> getCategories();

    List<Product> getProducts();

    Product findProductByName(String productName);

    Category findCategoryByName(String categoryName);

    void createCategory(String categoryToAdd);

    void createProduct(String name, String brand, double price, GenderType gender);

    boolean categoryExist(String categoryName);

    boolean productExist(String productName);

}
