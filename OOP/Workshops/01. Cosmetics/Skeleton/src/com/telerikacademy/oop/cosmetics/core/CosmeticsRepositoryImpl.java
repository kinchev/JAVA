package com.telerikacademy.oop.cosmetics.core;

import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.GenderType;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.models.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class CosmeticsRepositoryImpl implements CosmeticsRepository {

    private final List<Product> products;
    private final List<Category> categories;
    private final ShoppingCart shoppingCart;

    public CosmeticsRepositoryImpl() {
        this.products = new ArrayList<>();
        this.categories = new ArrayList<>();

        this.shoppingCart = new ShoppingCart();
    }

    @Override
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Product findProductByName(String productName) {
        /**
         * Hint: You have to go through every product and see if one has name equal to productName.
         *       If not, "throw new IllegalArgumentException("Product with this name does not exist");"
         */
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public Category findCategoryByName(String categoryName) {
        /**
         * Hint: You have to go through every category and see if one has name equal to categoryName.
         *       If not, "throw new IllegalArgumentException("Category with this name does not exist");"
         */
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void createCategory(String categoryName) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void createProduct(String name, String brand, double price, GenderType gender) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public boolean categoryExist(String categoryName) {
        /**
         * Hint: You have to go through every category and see if one has name equal to categoryName.
         *       If there is one, return true. If not, return false.
         */
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public boolean productExist(String productName) {
        /**
         * Hint: You have to go through every product and see if one has name equal to productName.
         *       If there is one, return true. If not, return false.
         */
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
