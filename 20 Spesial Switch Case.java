package com.Github;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("");
        int paket = input.nextInt();
        switch ( paket ) {
            case 1:
                System.out.println("Satu");
                System.out.println("Dua");
                System.out.println("Tiga");
                break;
            case 2:
                System.out.println("Dua");
                System.out.println("Tiga");
                break;
            case 3:
                System.out.println("Tiga");
                break;

        }
    }
}
