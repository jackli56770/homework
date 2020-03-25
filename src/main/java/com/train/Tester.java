package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int totalTicket = scanner.nextInt();

        System.out.println("How many round-trip tickets:");
        int roundTripTickets = scanner.nextInt();

        Ticket t = new Ticket(totalTicket, roundTripTickets);
        t.print();
    }
}
