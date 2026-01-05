package com.linkedlist.circularlinkedlist.onlineticket;
//Main class to test Online Ticket Reservation System
public class Main {

public static void main(String[] args) {

   TicketReservationSystem system = new TicketReservationSystem();

   system.addTicket(101, "Ansh", "Inception", "A12", "10:30 AM");
   system.addTicket(102, "karan", "Interstellar", "B05", "11:00 AM");
   system.addTicket(103, "pranshi", "Inception", "A13", "10:30 AM");

   system.displayAllTickets();

   System.out.println("\nSearch by Customer:");
   system.searchByCustomer("Arif");

   System.out.println("\nSearch by Movie:");
   system.searchByMovie("Inception");

   system.removeTicket(102);

   System.out.println("\nAfter Removal:");
   system.displayAllTickets();

   System.out.println("\nTotal Booked Tickets: " + system.countTickets());
}
}
