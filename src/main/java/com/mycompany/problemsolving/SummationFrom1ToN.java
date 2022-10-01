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
public class SummationFrom1ToN {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        long sum = (num*(num+1)) / 2;
        System.out.println(sum);
      
     }
}
