/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno6;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class UKLNO6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan golongan (A, B, C): ");
        String golongan = input.next().toUpperCase();

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        int pemakaian = input.nextInt();

        int tarif = 0;

        
        if (golongan.equals("A")) {
            tarif = 1200;
        } else if (golongan.equals("B")) {
            tarif = 1500;
        } else if (golongan.equals("C")) {
            tarif = 1800;
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        int totalAwal = pemakaian * tarif;

        
        double tambahan = 0;
        if (pemakaian > 500) {
            tambahan = totalAwal * 0.10; // 10%
        }

        
        double totalAkhir = totalAwal + tambahan;

        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Nama pelanggan        : " + nama);
        System.out.println("Golongan listrik      : " + golongan);
        System.out.println("Pemakaian listrik     : " + pemakaian + " kWh");
        System.out.println("Total sebelum tambahan: Rp " + totalAwal);
        System.out.println("Total tagihan akhir   : Rp " + totalAkhir);
    }
}
