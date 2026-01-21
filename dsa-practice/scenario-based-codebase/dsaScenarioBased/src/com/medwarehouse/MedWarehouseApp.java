package com.medwarehouse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedWarehouseApp {

    public static void main(String[] args) {

        // Branch A (sorted)
        List<Medicine> branchA = new ArrayList<>();
        branchA.add(new Medicine("Paracetamol", LocalDate.of(2026, 2, 10)));
        branchA.add(new Medicine("Ibuprofen", LocalDate.of(2026, 3, 5)));

        // Branch B (sorted)
        List<Medicine> branchB = new ArrayList<>();
        branchB.add(new Medicine("Amoxicillin", LocalDate.of(2026, 1, 28)));
        branchB.add(new Medicine("Cough Syrup", LocalDate.of(2026, 4, 15)));

        // Combine all branches
        List<Medicine> allMedicines = new ArrayList<>();
        allMedicines.addAll(branchA);
        allMedicines.addAll(branchB);

        // Apply Merge Sort
        List<Medicine> sortedMedicines =
                MergeSortUtil.mergeSort(allMedicines);

        System.out.println("MedWarehouse – Medicines by Expiry Date:");
        for (Medicine med : sortedMedicines) {
            System.out.println(med);
        }
    }
}

