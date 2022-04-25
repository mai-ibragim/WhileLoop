package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib bitte eine Zahl ein: ");
        int zahl = scan.nextInt();
        int counter = 0;

        while(zahl > 0) {
            zahl/= 10;
            counter++;
        }
        System.out.println(counter);
    }
}
