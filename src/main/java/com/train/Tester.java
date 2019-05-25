package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tickets;

        do{
            System.out.print("Please enter number of tickets: ");
            tickets = scanner.nextInt();
            if(tickets == -1)
                return;
            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();

            Ticket ticket = new Ticket(tickets , roundTrip);
            ticket.printInfo();
        }while( tickets != -1);
    }
}
