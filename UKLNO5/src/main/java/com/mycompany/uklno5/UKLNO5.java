/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklno5;

/**
 *
 * @author ASUS
 */
public class UKLNO5 {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 10, 12};
        boolean[] sudahDihitung = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            
            if (sudahDihitung[i]) {
                continue;  
            }

            int count = 1; 
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    sudahDihitung[j] = true;  
                }
            }

            System.out.println(array[i] + " muncul " + count + " kali");
        }
    }
}

