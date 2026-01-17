package com.smartcheckout;

class Billing {
    static void processBill(Customer c, Store store) {
        int total = 0;

        for (String item : c.items) {

            if (store.stockMap.containsKey(item)) {

                int stock = store.stockMap.get(item);

                if (stock > 0) {
                    total += store.priceMap.get(item);
                    store.stockMap.put(item, stock - 1);
                } else {
                    System.out.println(item + " is out of stock");
                }

            } else {
                System.out.println(item + " not found in store");
            }
        }

        System.out.println(c.name + " Bill Amount: " + total);
    }
}
