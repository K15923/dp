package com.laok.dp.creational.singleton.ex;

/**
 * @author k 2022/8/24 23:29
 */
public class SingletonExMain {

    public static void main(String[] args) {
        TicketMaker instance = TicketMaker.getInstance();
        int nextTicketNumber = instance.getNextTicketNumber();
        System.out.println(nextTicketNumber);
    }
}
