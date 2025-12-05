/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class UKLNO1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka yang kamu mau: ");
        int n = input.nextInt();

        int a = 0, b = 1;
        int even = 0, odd = 0;
        
        System.out.println("Deret Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
           
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\n======================");
        System.out.println("Jumlah bilangan genap: " + even);
        System.out.println("Jumlah bilangan ganjil: " + odd);

        input.close();
    }
}
