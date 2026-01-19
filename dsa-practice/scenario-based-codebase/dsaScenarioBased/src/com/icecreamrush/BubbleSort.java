package com.oopsScenarioBased.icecreamrush;

class BubbleSort {

    public static void sort(String[] flavors, int[] sales) {
        int n = sales.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent sales
                if (sales[j] > sales[j + 1]) {
                    // Swap sales
                    int tempSale = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSale;

                    // Swap corresponding flavors
                    String tempFlavor = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = tempFlavor;
                }
            }
        }
    }
}
