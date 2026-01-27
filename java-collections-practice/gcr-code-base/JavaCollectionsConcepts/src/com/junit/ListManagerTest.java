package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class ListManagerTest {

    // -----------------------------
    // ListManager methods
    // -----------------------------
    void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element)); // remove by value
    }

    int getSize(List<Integer> list) {
        return list.size();
    }

    // -----------------------------
    // JUnit Test Cases
    // -----------------------------
    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        addElement(list, 5);
        addElement(list, 10);
        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        addElement(list, 5);
        addElement(list, 10);
        removeElement(list, 5);
        assertEquals(1, list.size());
        assertFalse(list.contains(5));
        assertTrue(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, getSize(list));
        addElement(list, 1);
        addElement(list, 2);
        assertEquals(2, getSize(list));
        removeElement(list, 1);
        assertEquals(1, getSize(list));
    }
}
