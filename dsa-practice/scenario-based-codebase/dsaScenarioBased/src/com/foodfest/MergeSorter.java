package com.foodfest;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter {

    public static List<FoodStall> mergeSort(List<FoodStall> stalls) {
        if (stalls.size() <= 1) {
            return stalls;
        }

        int mid = stalls.size() / 2;

        List<FoodStall> left = mergeSort(stalls.subList(0, mid));
        List<FoodStall> right = mergeSort(stalls.subList(mid, stalls.size()));

        return merge(left, right);
    }

    // Stable merge: left element chosen first if equal
    private static List<FoodStall> merge(List<FoodStall> left, List<FoodStall> right) {
        List<FoodStall> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getFootfall() <= right.get(j).getFootfall()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i++));
        }

        while (j < right.size()) {
            result.add(right.get(j++));
        }

        return result;
    }
}

