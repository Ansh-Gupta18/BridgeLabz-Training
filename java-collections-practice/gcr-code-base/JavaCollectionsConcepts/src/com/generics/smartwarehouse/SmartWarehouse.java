package com.generics.smartwarehouse;

public class SmartWarehouse {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 75000));
        electronicsStorage.addItem(new Electronics("Mobile", 30000));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 1200));
        groceriesStorage.addItem(new Groceries("Wheat", 900));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 2500));
        furnitureStorage.addItem(new Furniture("Table", 5000));

        System.out.println(" Electronics Storage:");
        WarehouseUtil.displayItems(electronicsStorage.getItems());

        System.out.println("\n Groceries Storage:");
        WarehouseUtil.displayItems(groceriesStorage.getItems());

        System.out.println("\n Furniture Storage:");
        WarehouseUtil.displayItems(furnitureStorage.getItems());
    }
}

