package com.telerikacademy.oop.cosmetics.models;

import com.telerikacademy.oop.cosmetics.models.contracts.Product;
import com.telerikacademy.oop.cosmetics.models.enums.GenderType;

public abstract class ProductImpl implements Product {

    private String name;
    private String brandName;
    private double price;
    private final GenderType genderType;

    public ProductImpl(String name, String brandName, double price, GenderType genderType) {
        setName(name);
        setBrandName(brandName);
        setPrice(price);
        this.genderType = genderType;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        validateName(name);
        this.name = name;
    }

    protected abstract void validateName(String name);

    public String getBrandName() {
        return brandName;
    }

    private void setBrandName(String brand) {
        validateBrandName(brand);
        this.brandName = brand;
    }

    protected abstract void validateBrandName(String brand);

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    protected abstract void validatePrice(double price);

    public GenderType getGenderType() {
        return genderType;
    }

    @Override
    public String print() {
        return String.format(
                "#%s %s\n" +
                " #Price: $%.2f\n" +
                " #Gender: %s\n",
                name,
                brandName,
                price,
                genderType);
    }

}

