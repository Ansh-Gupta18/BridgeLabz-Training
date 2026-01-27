package com.annotations;

import java.util.ArrayList;

public class SuppressWarningTest {

    @SuppressWarnings("unchecked")  // suppresses unchecked cast warnings
    public static void main(String[] args) {

        // Using ArrayList without generics (raw type)
        ArrayList list = new ArrayList();

        // Adding elements (unchecked warning would normally appear)
        list.add("Apple");
        list.add("Banana");
        list.add(123);  // mixing types is allowed in raw ArrayList

        // Retrieving elements (unchecked cast warning)
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}

