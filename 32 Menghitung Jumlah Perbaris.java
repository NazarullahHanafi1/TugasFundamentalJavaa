package com.Github;

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int matrix[][] = new int[5][5];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        int hasil = 0;
        for (int i = 0; i < 5;i++){
            for (int j = 0; j < 5;j++){
                hasil += matrix[i][j];
            }
            System.out.println(hasil);
            hasil = 0;
        }
    }
}