package com.oopsScenarioBased.booksystem;

import java.util.*;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    // Add Contact with duplicate validation
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println(" Contact added successfully!");
    }

    // Edit contact by name
    public void editContact(String name, String phone, String email) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.setPhone(phone);
                c.setEmail(email);
                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("❌ Contact not found!");
    }

    // Delete contact by name
    public void deleteContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println(" Contact deleted!");
                return;
            }
        }
        System.out.println(" Contact not found!");
    }

    // Search by city or state
    public void searchByCityOrState(String value) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No contacts found!");
        }
    }

    // Display sorted contacts
    public void displayContacts() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        System.out.println("\n Address Book:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}

