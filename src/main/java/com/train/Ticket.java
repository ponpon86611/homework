package com.train;

public class Ticket {

    /*
        ticketsCount 購買張數
        roundTrip 來回票張數
        totalPrice 總金額
     */
    int ticketsCount;
    int roundTrip;
    int totalPrice;

    //無參數建構子
    public Ticket()
    {

    }

    public Ticket(int ticketsCount, int roundTrip) {
        this.ticketsCount = ticketsCount;
        this.roundTrip = roundTrip;
    }

    public void calculatePrice()
    {
        this.totalPrice =  Math.round(this.roundTrip * 2000*0.9F) + (this.ticketsCount - this.roundTrip)*1000 ;
    }

    public void printInfo()
    {
        calculatePrice();
        System.out.print("Total tickets: " + ticketsCount + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + totalPrice);
    }
}
