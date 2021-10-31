package com.telerikacademy.oop.cosmetics.commands;

import com.telerikacademy.oop.cosmetics.core.contracts.Command;
import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.enums.GenderType;
import com.telerikacademy.oop.cosmetics.models.enums.UsageType;
import com.telerikacademy.oop.cosmetics.utils.ParsingHelpers;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import java.util.List;

import static com.telerikacademy.oop.cosmetics.utils.ParsingHelpers.*;

public class CreateShampooCommand implements Command {

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 6;

    private final CosmeticsRepository cosmeticsRepository;

    public CreateShampooCommand(CosmeticsRepository cosmeticsRepository) {
        this.cosmeticsRepository = cosmeticsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidationHelpers.validateArgumentsCount(parameters, EXPECTED_NUMBER_OF_ARGUMENTS);
        String name = parameters.get(0);
        String brandName = parameters.get(1);
        double price = ParsingHelpers.tryParseDouble(parameters.get(2), INVALID_PRICE);
        GenderType genderType = ParsingHelpers.tryParseGender(parameters.get(3).toUpperCase());
        int millilitres = ParsingHelpers.tryParseInt(parameters.get(4), INVALID_MILLILITRES);
        UsageType usageType = ParsingHelpers.tryParseUsageType(parameters.get(5).toUpperCase());
        return createShampoo(name, brandName, price, genderType, millilitres, usageType);
    }

    private String createShampoo(String name, String brandName, double price, GenderType genderType,
                                 int millilitres, UsageType usageType) {
        if (cosmeticsRepository.productExist(name)) {
            throw new IllegalArgumentException(String.format(PRODUCT_NAME_ALREADY_EXISTS, "Shampoo", name));
        }

        cosmeticsRepository.createShampoo(name, brandName, price, genderType, millilitres, usageType);

        return String.format(PRODUCT_CREATED, "Shampoo", name);
    }

}
