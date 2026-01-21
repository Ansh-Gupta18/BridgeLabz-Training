package com.oopsScenarioBased.booksystem;

public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Contact c1 = new Contact(
                "Ansh", "Gupta",
                "9876543210",
                "ansh@gmail.com",
                new Address("Bhopal", "MP", "462001")
        );

        Contact c2 = new Contact(
                "Riya", "Sharma",
                "9123456780",
                "riya@gmail.com",
                new Address("Indore", "MP", "452001")
        );

        addressBook.addContact(c1);
        addressBook.addContact(c2);

        addressBook.displayContacts();

        System.out.println("\n Search by City:");
        addressBook.searchByCityOrState("Bhopal");

        System.out.println("\n Edit Contact:");
        addressBook.editContact("Ansh Gupta", "9999999999", "ansh_new@gmail.com");

        System.out.println("\n Delete Contact:");
        addressBook.deleteContact("Riya Sharma");

        addressBook.displayContacts();
    }
}

