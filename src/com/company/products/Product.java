package com.company.products;

import java.util.Objects;

public abstract class Product {

    private double price;
    private double overprice;
    private String name;

    public Product(String name, double price, double overprice) {
        this.price = price;
        this.overprice = overprice;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public double getOverprice() {
        return overprice;
    }

    public String getName() {
        return name;
    }

    public double extraCharge() {
        return overprice - price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.overprice, overprice) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, overprice, name);
    }

}
