package com.laok.dp.structural.adapter.ep;

public class EpMain {

    public static void main(String[] args) {
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
