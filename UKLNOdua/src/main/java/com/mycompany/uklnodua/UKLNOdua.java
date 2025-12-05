/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnodua;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class UKLNOdua {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan angka maks");
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {

            System.out.print(i + " . ");

            if (i == 5) {
                System.out.println("saya senang");
            }
            else 
                if (i % 3 == 2) {
                    System.out.println("saya anak moklet");
                } else if (i % 3 == 1) {
                    System.out.println("saya anak wikusama");
                } else {
                    System.out.println("saya angkatan 34");
                
            }
        }
    }
}
