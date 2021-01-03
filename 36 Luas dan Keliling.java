package com.Github;

import java.util.Scanner;
class Main{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Double x,y,m,n;
        x= scan.nextDouble();
        y= scan.nextDouble();

        m= luas(x,y);
        n = keliling(x,y);

        System.out.println(m);
        System.out.println(n);
    }
    static Double luas(Double p, Double l){
        return p * l;
    }
    static Double keliling(Double p ,Double l){
        return 2*(p+l);
    }
}