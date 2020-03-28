package com.company.products;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodProducts extends Product {

    private Date expireDate;

    public FoodProducts(String name, double price, double overprice, Date expireDate) {
        super(name, price, overprice);
        this.expireDate = expireDate;
    }

    public String getExpireDate() {
        return new SimpleDateFormat("YYYY-MMM-DD").format(expireDate);
    }
}
