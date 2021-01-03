package com.Github;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        int matrik [] [] = new int[10][10];
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt();

        for (int i = 0 ; i <x  ; i++){
            for (int j = 0 ; j <x ; j++){
                System.out.print( (matrik[i][j] = j) + " ");
            }
            System.out.println("");
        }
    }
}