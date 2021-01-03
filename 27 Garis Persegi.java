package com.Github;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();


        for (int i=0; i<x; i++){
            if ( i == 0 || i == (x - 1)){
                for (int j = x ; j > 0 ; j--){
                    System.out.print("#");
                }
            }else {
                for (int j = x ; j > 0 ; j--){
                    if ( j == x || j == 1){
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
    }
}