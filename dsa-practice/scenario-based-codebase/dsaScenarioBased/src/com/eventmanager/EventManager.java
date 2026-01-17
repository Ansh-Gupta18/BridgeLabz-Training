package com.eventmanager;

public class EventManager {

    // Quick Sort method
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Recursive calls
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition logic
    static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // choose last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                // swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Main method
    public static void main(String[] args) {

        int[] ticketPrices = {450, 1200, 300, 800, 1500, 200};

        quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("Sorted Ticket Prices:");
        for (int price : ticketPrices) {
            System.out.print(price + " ");
        }
    }
}

