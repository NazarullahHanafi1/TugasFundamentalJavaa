package com.Github;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        String isi = "Ini adalah data yang akan disimpan ke dalam file.";
        Path file = Paths.get("src/save.txt");

        try {
            Files.write(file, isi.getBytes());
        } catch (IOException exception) {
            System.out.println("Selamat, kamu berhasil membaca data dari file");
        }

    }
}
