package com.company.products;

public class BuildingProduct extends Product implements Deliverable {

    private double deliveryPrice;

    public BuildingProduct( String name, double price, double overprice, double deliveryPrice) {
        super(name, price, overprice);
        this.deliveryPrice = deliveryPrice;
    }


    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    @Override
    public double extraCharge() {
        return super.extraCharge() - getDeliveryPrice();
    }
}
