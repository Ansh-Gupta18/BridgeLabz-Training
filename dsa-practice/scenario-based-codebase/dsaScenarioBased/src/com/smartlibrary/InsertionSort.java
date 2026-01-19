package com.oopsScenarioBased.smartlibrary;

class InsertionSort {

    public static void sort(String[] books, int n) {

        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && books[j].compareToIgnoreCase(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
}

