package com.telerikacademy.oop.cosmetics.commands;

import com.telerikacademy.oop.cosmetics.core.contracts.Command;
import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.enums.GenderType;
import com.telerikacademy.oop.cosmetics.utils.ParsingHelpers;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import java.util.Arrays;
import java.util.List;

import static com.telerikacademy.oop.cosmetics.utils.ParsingHelpers.*;

public class CreateToothpasteCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 5;

    private final CosmeticsRepository cosmeticsRepository;

    public CreateToothpasteCommand(CosmeticsRepository cosmeticsRepository) {
        this.cosmeticsRepository = cosmeticsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidationHelpers.validateArgumentsCount(parameters, EXPECTED_NUMBER_OF_ARGUMENTS);
        String name = parameters.get(0);
        String brandName = parameters.get(1);
        double price = ParsingHelpers.tryParseDouble(parameters.get(2), INVALID_PRICE);
        GenderType genderType = ParsingHelpers.tryParseGender(parameters.get(3).toUpperCase());
        String ingredients = parameters.get(4);
        List<String> ingredientsList = Arrays.asList(ingredients.split(","));
        return createToothpaste(name, brandName, price, genderType, ingredientsList);
    }

    private String createToothpaste(String name, String brandName, double price, GenderType genderType,
                                    List<String> ingredientsList) {
        if (cosmeticsRepository.productExist(name)) {
            throw new IllegalArgumentException(String.format(PRODUCT_NAME_ALREADY_EXISTS, "Toothpaste", name));
        }

        cosmeticsRepository.createToothpaste(name, brandName, price, genderType, ingredientsList);

        return String.format(PRODUCT_CREATED, "Toothpaste", name);
    }

}