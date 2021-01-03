package com.Github;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        int array []= new int [10];
        Scanner scan= new Scanner(System.in);


        for (int i = 1; i <= 5 ;i++){
            array[i] = scan.nextInt();
        }
        for (int i = 5 ; i >=1 ; i--){
            System.out.println(array[i]);
        }
    }
}