package com.linkedlist.singlylinkedlist.inventorymanagement;

//Represents a single item in the inventory (Node of Singly Linked List)
public class ItemNode {

int itemId;
String itemName;
int quantity;
double price;
ItemNode next;

// Constructor
public ItemNode(int itemId, String itemName, int quantity, double price) {
   this.itemId = itemId;
   this.itemName = itemName;
   this.quantity = quantity;
   this.price = price;
   this.next = null;
}
}