package com.example.appletree;

public class Main {
    public static void main(String[] args) {
        Golden GoldObject = new Golden();

        GoldObject.setName("Golden deli apple");
        GoldObject.setColor("Super gold");
        GoldObject.setGoldIndex("Max amount of Gold");

        System.out.println(GoldObject.getColor());
        System.out.println(GoldObject.getName());
        System.out.println(GoldObject.getGoldIndex());
    }
}
