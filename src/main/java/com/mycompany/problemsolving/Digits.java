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
public class Digits {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i=0;i<size;i++){
            int value = scanner.nextInt(); // 0
            if(value == 0){
                System.out.println(0);
                continue;
            }
            while (value !=0){
                int mynum = value % 10;
                System.out.print(mynum + " ");
                value /= 10;
            }
            System.out.println();

        }
    }
}
