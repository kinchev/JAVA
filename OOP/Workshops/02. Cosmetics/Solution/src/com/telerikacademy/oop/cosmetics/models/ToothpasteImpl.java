package com.telerikacademy.oop.cosmetics.models;

import com.telerikacademy.oop.cosmetics.models.contracts.Toothpaste;
import com.telerikacademy.oop.cosmetics.models.enums.GenderType;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import java.util.ArrayList;
import java.util.List;

import static com.telerikacademy.oop.cosmetics.utils.ParsingHelpers.INVALID_PRICE;

public class ToothpasteImpl extends ProductImpl implements Toothpaste {

    public static final int NAME_MIN_LENGTH = 3;
    public static final int NAME_MAX_LENGTH = 10;
    public static final int BRAND_NAME_MIN_LENGTH = 2;
    public static final int BRAND_NAME_MAX_LENGTH = 10;

    private final List<String> ingredients;

    public ToothpasteImpl(String name, String brandName, double price, GenderType genderType, List<String> ingredients) {
        super(name, brandName, price, genderType);
        this.ingredients = ingredients;
    }

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    @Override
    protected void validateName(String name) {
        ValidationHelpers.validateStringLength(name, NAME_MIN_LENGTH, NAME_MAX_LENGTH, "Name");
    }

    @Override
    protected void validateBrandName(String brandName) {
        ValidationHelpers.validateStringLength(brandName, BRAND_NAME_MIN_LENGTH,
                BRAND_NAME_MAX_LENGTH, "Brand name");
    }

    @Override
    protected void validatePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException(INVALID_PRICE);
        }
    }

    @Override
    public String print() {
        String product = super.print();
        String ingredientsString = String.join(", ", ingredients);
        return String.format(
                "%s" +
                " #Ingredients: [%s]\n",
                product,
                ingredientsString);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToothpasteImpl toothpaste = (ToothpasteImpl) o;
        return getName().equals(toothpaste.getName()) &&
               getBrandName().equals(toothpaste.getBrandName()) &&
               getPrice() == toothpaste.getPrice() &&
               this.getGenderType().equals(toothpaste.getGenderType()) &&
               getIngredients().equals(toothpaste.getIngredients());
    }

}
