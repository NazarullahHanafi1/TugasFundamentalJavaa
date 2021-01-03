package com.Github;

class Main {
    public static void main(String[] args) {
        int[] data = {4,2,3,3,2,4,6,7,3,9};

        System.out.println(ujian(data));

    }

    public static int ujian(int[] data) {

        int temp =1;
        int jumlah =1;
        for (int j = data.length-1; j >0; j--) {
            if (data[j] > data[j - 1]) {
                temp++;
            } else {
                temp = 1;

            }
            if (temp >= jumlah) {
                jumlah = temp;
            }
        }
        return jumlah;
    }
}