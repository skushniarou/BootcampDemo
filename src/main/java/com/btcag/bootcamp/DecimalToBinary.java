package com.btcag.bootcamp;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Bitte positive ganze Zahl eingeben");
        Scanner scr = new Scanner(System.in);
        int nr = scr.nextInt();
        String result = "";

        while (nr > 0){
            int result_Modulo = nr % 2;
            result = result_Modulo + result;
            nr = nr / 2;
        }

        System.out.println("Unsere Ergebnis: " + result);
    }
}
