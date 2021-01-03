package com.Github;

import java.util.Locale;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int uang = input.nextInt();
        Locale bahasa = new Locale("id");
        System.out.printf(bahasa,"Rp%,d,-" , uang);
    }
}