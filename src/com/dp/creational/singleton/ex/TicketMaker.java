package com.dp.creational.singleton.ex;

/**
 * @author k 2022/8/24 23:26
 */
public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    private TicketMaker() {
        System.out.println("生成TicketMaker实例");
    }
    private int ticker = 1000;

    public int getNextTicketNumber() {
        return ticker++;
    }

}
