package com.Github;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("");
        int nilai = input.nextInt();

        if ( nilai > 75 ) {
            System.out.println("Sangat Bagus");
        } else if ( nilai < 55 ) {
            System.out.println("Kurang");
        } else {
            System.out.println("Bagus");
        }

    }
}