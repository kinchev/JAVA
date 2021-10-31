package com.telerikacademy.oop.cosmetics.models;

import com.telerikacademy.oop.cosmetics.models.contracts.Cream;
import com.telerikacademy.oop.cosmetics.models.enums.GenderType;
import com.telerikacademy.oop.cosmetics.models.enums.ScentType;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import static com.telerikacademy.oop.cosmetics.utils.ParsingHelpers.INVALID_PRICE;

public class CreamImpl extends ProductImpl implements Cream {

    public static final int NAME_MIN_LENGTH = 3;
    public static final int NAME_MAX_LENGTH = 15;
    public static final int BRAND_NAME_MIN_LENGTH = 3;
    public static final int BRAND_NAME_MAX_LENGTH = 15;

    private final ScentType scent;

    public CreamImpl(String name, String brandName, double price, GenderType genderType, ScentType scent) {
        super(name, brandName, price, genderType);
        this.scent = scent;
    }

    @Override
    public ScentType getScent() {
        return this.scent;
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
        return String.format(
                "%s" +
                " #Scent: %s\n",
                super.print(),
                scent);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreamImpl cream = (CreamImpl) o;
        return getName().equals(cream.getName()) &&
               getBrandName().equals(cream.getBrandName()) &&
               getPrice() == cream.getPrice() &&
               getGenderType().equals(cream.getGenderType()) &&
               getScent().equals(cream.getScent());
    }

}
