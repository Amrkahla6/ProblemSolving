/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problemsolving;

import java.util.Scanner;

/**
 *
 * @author amr
 */
public class watermelon {
    /** The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — 
    * the weight of the watermelon bought by the boys.rint YES, if the boys can divide the watermelon into two parts,
    * each of them weighing even number of kilos; and NO in the opposite case
    *
     * @param args */
    
    
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num <= 2){
            System.out.println("NO");
            return;
        }
        if(num % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
   
}