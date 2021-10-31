package com.telerikacademy.oop.cosmetics.tests.utils;

import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.Product;

public class TestData {

    public static class CategoryData {
        public static final String VALID_NAME = "x".repeat(Category.NAME_MIN_LENGTH + 1);
    }

    public static class ProductData {
        public static final String VALID_NAME = "x".repeat(Product.NAME_MIN_LENGTH + 1);
        public static final String VALID_BRAND_NAME = "x".repeat(Product.BRAND_MIN_LENGTH + 1);
    }
}
