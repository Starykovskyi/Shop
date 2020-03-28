package com.company;

import com.company.products.BuildingProduct;
import com.company.products.FoodProducts;
import com.company.products.Product;
import com.company.products.TechProduct;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products = new ArrayList<>();

    private List<Product> soldProducts = new ArrayList<>();

    public void setProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public void sell(String name) {
        Product tmp = null;
        for (Product p : products) {
            if(p.getName().equals(name)) {
                tmp = p;
            }
        }
        if(tmp != null) {
            products.remove(tmp);
            soldProducts.add(tmp);
        }
    }

    public void sell(List<String> productToSell) {
        for (String p : productToSell) {
            sell(p);
        }
    }

    public void printProducts() {
        int foodCounter = 0;
        int techCounter = 0;
        int buildingCounter = 0;
        for (Product p : products) {
            if (p instanceof BuildingProduct) {
                buildingCounter++;
            } else if (p instanceof TechProduct) {
                techCounter++;
            } else {
                foodCounter++;
            }
        }

        System.out.println(
                "BuildingProduct count " + buildingCounter + "\nTechProduct count " + techCounter + "\nFoodProduct count " + foodCounter
        );
    }

    public void printStats() {
        double food = 0;
        double tech = 0;
        double building = 0;

        for (Product p : soldProducts) {
            if (p instanceof BuildingProduct) {
                building += p.extraCharge();
            } else if (p instanceof TechProduct) {
                tech += p.extraCharge();
            } else {
                food += p.extraCharge();
            }
        }
        double total = food + tech + building;

        System.out.println(
                "BuildingProduct:  " + building + "\nTechProduct: " + tech + "\nFoodProduct " + food + "\nTotal " + total
        );

    }


//    private List<Product> foodProducts() {
//        List<Product> tmp = new ArrayList<>();
//        for (Product p : products) {
//            if (p instanceof FoodProducts) {
//                tmp.add(p);
//            }
//        }
//        return tmp;
//    }
}
