package com.Github;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("");
        int nilai = input.nextInt();

        if (nilai >= 55) {


            System.out.println("Selamat! Anda lulus dengan nilai " + nilai  );
            System.out.println("Program selesai");
        } else {
            System.out.println("Program selesai");
        }
    }
}