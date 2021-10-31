package com.telerikacademy.oop.cosmetics.models;

import com.telerikacademy.oop.cosmetics.models.contracts.Shampoo;
import com.telerikacademy.oop.cosmetics.models.enums.GenderType;
import com.telerikacademy.oop.cosmetics.models.enums.UsageType;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import static com.telerikacademy.oop.cosmetics.utils.ParsingHelpers.INVALID_MILLILITRES;
import static com.telerikacademy.oop.cosmetics.utils.ParsingHelpers.INVALID_PRICE;

public class ShampooImpl extends ProductImpl implements Shampoo {

    public static final int NAME_MIN_LENGTH = 3;
    public static final int NAME_MAX_LENGTH = 10;
    public static final int BRAND_NAME_MIN_LENGTH = 2;
    public static final int BRAND_NAME_MAX_LENGTH = 10;

    private int millilitres;
    private final UsageType usageType;

    public ShampooImpl(String name, String brand, double price, GenderType genderType, int milliliters, UsageType usageType) {
        super(name, brand, price, genderType);
        setMillilitres(milliliters);
        this.usageType = usageType;
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

    public int getMillilitres() {
        return millilitres;
    }

    public UsageType getUsageType() {
        return usageType;
    }

    private void setMillilitres(int millilitres) {
        if (millilitres < 0) {
            throw new IllegalArgumentException(INVALID_MILLILITRES);
        }
        this.millilitres = millilitres;
    }

    @Override
    public String print() {
        return String.format(
                "%s" +
                " #Milliliters: %d\n" +
                " #Usage: %s\n",
                super.print(),
                millilitres,
                usageType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShampooImpl shampoo = (ShampooImpl) o;
        return getName().equals(shampoo.getName()) &&
               getBrandName().equals(shampoo.getBrandName()) &&
               getPrice() == shampoo.getPrice() &&
               getGenderType().equals(shampoo.getGenderType()) &&
               getMillilitres() == shampoo.getMillilitres() &&
               getUsageType().equals(shampoo.getUsageType());
    }

}
