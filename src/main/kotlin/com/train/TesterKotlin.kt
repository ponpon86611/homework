package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val ticketCount = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val tickets = Tickets(ticketCount , roundTrip);

    tickets.printInfo()
}


class Tickets(var ticketsCount:Int , var roundTrip : Int){

    var totalPrice = 0;

    fun calculatePrice()
    {
        this.totalPrice = Math.round( roundTrip*2000*0.9F ) +  (ticketsCount - roundTrip)*1000
    }

    fun printInfo()
    {
        calculatePrice()
        print("Total tickets: " + ticketsCount + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + totalPrice)
    }
}