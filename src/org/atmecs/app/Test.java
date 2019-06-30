package org.atmecs.app;

public class Test {
	public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"Amulu",2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Chinnu",2);
        
        t1.start();
        t2.start();
    }
}
