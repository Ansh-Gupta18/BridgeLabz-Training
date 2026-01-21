package com.medwarehouse;

import java.util.ArrayList;
import java.util.List;

public class MergeSortUtil {

    public static List<Medicine> mergeSort(List<Medicine> medicines) {
        if (medicines.size() <= 1) {
            return medicines;
        }

        int mid = medicines.size() / 2;

        List<Medicine> left = mergeSort(medicines.subList(0, mid));
        List<Medicine> right = mergeSort(medicines.subList(mid, medicines.size()));

        return merge(left, right);
    }

    // Stable merge by expiry date
    private static List<Medicine> merge(List<Medicine> left, List<Medicine> right) {
        List<Medicine> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (!left.get(i).getExpiryDate()
                    .isAfter(right.get(j).getExpiryDate())) {
                result.add(left.get(i++));   // stable for equal expiry
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }
}

