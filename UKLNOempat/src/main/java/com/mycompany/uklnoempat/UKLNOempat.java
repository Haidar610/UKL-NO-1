/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnoempat;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKLNOempat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int angkaBenar = random.nextInt(100) + 1; 
        ArrayList<Integer> tebakanPlayer = new ArrayList<>();

        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Komputer sudah memilih angka antara 1 - 100.");
        System.out.println("Silakan tebak!");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            int guess = input.nextInt();

            
            tebakanPlayer.add(guess);

            if (guess > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi!");
            } else if (guess < angkaBenar) {
                System.out.println("Tebakan terlalu rendah!");
            } else {
                System.out.println("Anda menebak dengan benar!");
                break; 
            }
        }

        
        System.out.println("\n=== Riwayat Tebakan Anda ===");
        for (int t : tebakanPlayer) {
            System.out.println("- " + t);
        }

        input.close();
    }
}

