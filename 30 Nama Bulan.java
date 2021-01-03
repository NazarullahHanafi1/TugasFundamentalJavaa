package com.Github;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] namaBulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };
        int x = scan.nextInt();
        if (x>0 && x<12 ){
            System.out.print(namaBulan [x-1]);

        }
        else {
            System.out.print("Nomor tidak valid");
        }

    }
}