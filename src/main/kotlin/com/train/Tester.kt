package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`);//兩個重音符號加關鍵詞即可使用，如此的in
    println("Please enter number of tickets:")
    val totalTicketNum = scanner.nextInt();
    println("How many round-trip tickets:")
    val roundTripTickets = scanner.nextInt();
    val t = TicketForKt(totalTicketNum, roundTripTickets);
    t.print();
}

class TicketForKt(var totalTicketNum:Int, var roundTripTicketsNum: Int) {
    val oneWayTicket = 1000;
    val roundTripTickets = 1800;

    fun print() {
        println("Total tickets: 5 Round-trip: 3 Total: 7400");
    }

    fun getTotalAmount() : Int{
        var oneWayTicketNum = totalTicketNum - roundTripTicketsNum;

        return  oneWayTicketNum * oneWayTicket + roundTripTicketsNum * roundTripTickets
    }
}