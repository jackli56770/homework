package com.train;

public class Ticket {
    public static int oneWayTicket = 1000;
    public static int roundTripTickets = 1800;

    int totalTicketNum;
    int oneWayTicketNum;
    int roundTripTicketsNum;

    public Ticket(int totalTicketNum, int roundTripTicketsNum) {
        this.totalTicketNum = totalTicketNum;
        this.roundTripTicketsNum = roundTripTicketsNum;
        this.oneWayTicketNum = totalTicketNum - roundTripTicketsNum;
    }

    public int getTotalAmount() {
        return oneWayTicketNum * oneWayTicket + roundTripTicketsNum * roundTripTickets;
    }

    public void print() {
        System.out.println("Total tickets:" + totalTicketNum +" Round-trip: " + roundTripTicketsNum
                + " Total:" + getTotalAmount());
    }
}
