/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno7;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class UKLNO7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = input.nextInt();
        input.nextLine(); 

        String[] nama = new String[jumlahPaket];
        int[] biayaProduksi = new int[jumlahPaket];
        int[] hargaJual = new int[jumlahPaket];
        int[] jumlahEvent = new int[jumlahPaket];
        int[] totalBiaya = new int[jumlahPaket];
        int[] totalPendapatan = new int[jumlahPaket];
        int[] labaRugi = new int[jumlahPaket];
        String[] status = new String[jumlahPaket];

        int totalLabaRugiKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String paketLabaTertinggi = "";

        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("\nPaket ke-" + (i + 1));

            System.out.print("Nama paket: ");
            nama[i] = input.nextLine();

            System.out.print("Biaya produksi per event: ");
            biayaProduksi[i] = input.nextInt();

            System.out.print("Harga jual per event: ");
            hargaJual[i] = input.nextInt();

            System.out.print("Jumlah event terjual: ");
            jumlahEvent[i] = input.nextInt();
            input.nextLine();  

            // Perhitungan
            totalBiaya[i] = biayaProduksi[i] * jumlahEvent[i];
            totalPendapatan[i] = hargaJual[i] * jumlahEvent[i];
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];

            if (labaRugi[i] > 0) {
                status[i] = "Laba";
            } else if (labaRugi[i] < 0) {
                status[i] = "Rugi";
            } else {
                status[i] = "Impas";
            }

            totalLabaRugiKeseluruhan += labaRugi[i];

            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                paketLabaTertinggi = nama[i];
            }
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.println("Nama Paket\t| Total Biaya\t| Total Pendapatan\t| Laba/Rugi\t| Status");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println(
                nama[i] + "\t| Rp" + totalBiaya[i] + 
                "\t| Rp" + totalPendapatan[i] + 
                "\t| Rp" + labaRugi[i] + 
                "\t| " + status[i]
            );
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + totalLabaRugiKeseluruhan);
        System.out.println("Paket dengan Laba Tertinggi: " + paketLabaTertinggi + " (Rp" + labaTertinggi + ")");

        input.close();
    }
}
