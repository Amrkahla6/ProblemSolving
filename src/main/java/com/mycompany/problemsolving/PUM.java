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
public class PUM {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i=1; i<=number*4; i += 4){
            int mumber1 = i + 1;
            int mumbe2  = mumber1 + 1;
            System.out.println(i + " " + mumber1 + " " + mumbe2 + " PUM");
        }
    }
}
