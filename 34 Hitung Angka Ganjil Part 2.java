package com.Github;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrik[][] = new int[10][10];
        int x = scan.nextInt();
        int y = scan.nextInt();
        int hasil[] = new int [10];

        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                matrik[i][j] = scan.nextInt();
            }
        }
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
                if (matrik [i][j] % 2==1){
                    hasil[i]++;
                }

            }
        }
        for (int i=0; i<x; i++){
            System.out.println(hasil[i]);
        }
    }
}