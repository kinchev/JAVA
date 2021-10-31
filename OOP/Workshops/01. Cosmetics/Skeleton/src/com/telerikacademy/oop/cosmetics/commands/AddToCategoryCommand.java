package com.telerikacademy.oop.cosmetics.commands;

import com.telerikacademy.oop.cosmetics.commands.contracts.Command;
import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import java.util.List;

public class AddToCategoryCommand implements Command {

    private static final String PRODUCT_ADDED_TO_CATEGORY = "Product %s added to category %s!";

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 2;

    private final CosmeticsRepository cosmeticsRepository;

    public AddToCategoryCommand(CosmeticsRepository cosmeticsRepository) {
        this.cosmeticsRepository = cosmeticsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidationHelpers.validateArgumentsCount(parameters, EXPECTED_NUMBER_OF_ARGUMENTS);
        String categoryNameToAdd = parameters.get(0);
        String productToAdd = parameters.get(1);
        return addToCategory(categoryNameToAdd, productToAdd);
    }

    private String addToCategory(String categoryNameToAdd, String productToAdd) {
        Category category = cosmeticsRepository.findCategoryByName(categoryNameToAdd);
        Product product = cosmeticsRepository.findProductByName(productToAdd);

        category.addProduct(product);

        return String.format(PRODUCT_ADDED_TO_CATEGORY, productToAdd, categoryNameToAdd);
    }

}
