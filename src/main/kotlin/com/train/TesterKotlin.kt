package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var ticketCount = 0;
    while(ticketCount != -1){
        print("Please enter number of tickets: ")
        ticketCount = scanner.nextInt()
        if(ticketCount == -1)
            return
        print("How many round-trip tickets: ")
        val roundTrip = scanner.nextInt()
        val tickets = Tickets(ticketCount , roundTrip);
        tickets.printInfo()
    }
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
        println("Total tickets: " + ticketsCount + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + totalPrice)
    }
}