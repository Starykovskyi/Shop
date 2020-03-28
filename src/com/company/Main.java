package com.company;

import com.company.products.BuildingProduct;
import com.company.products.FoodProducts;
import com.company.products.Product;
import com.company.products.TechProduct;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /**     Реализовать магазин, который продает 3 вида товара. Программа должна уметь
         продавать товар как по одному так и сразу несколько разных товаров
         Заполнять магазин прибывшими товарами
         показывать, сколько осталось в магазине каждого товара
         Показывать какова прибыль на текущий момент продавца по каждому товару и общая прибыль (Прибыль = доход - себестоимость товара).
         */

        Shop shop = new Shop();

        Product[] products = new Product[] {
                new BuildingProduct("Плинтус", 10, 14, 0),
                new BuildingProduct("Плинтус", 10, 14, 0),
                new BuildingProduct("Цемент", 250, 320, 20),

                new TechProduct("Холодильник", 10000, 14000, "AAAAA+"),
                new FoodProducts("Шоколад", 60, 89, new Date()),
        };

        shop.setProducts(Arrays.asList(products));

        shop.printProducts();
        System.out.println("--------------------------");
        shop.printStats();

        shop.sell( "Холодильник");

        String[] names = new String[] {"Цемент", "Плинтус"};
        shop.sell(Arrays.asList(names));

        System.out.println("--------------------------");
        shop.printProducts();
        System.out.println("--------------------------");
        shop.printStats();
    }


}
