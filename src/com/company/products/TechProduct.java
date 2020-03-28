package com.company.products;

public class TechProduct extends Product {

    private String energyClass;

    public TechProduct(String name, double price, double overprice, String energyClass) {
        super(name, price, overprice);
        this.energyClass = energyClass;
    }

    public String getEnergyClass() {
        return energyClass;
    }
}
