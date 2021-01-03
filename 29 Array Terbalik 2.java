package com.Github;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int array[]= new int [10];
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 0 ; i < x ; i++){
            array[i]= scan.nextInt();
        }
        for (int i = x-1 ; i >= 0 ; i--){
            System.out.print(array[i] + " ");
        }

    }
}