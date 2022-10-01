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
public class NightAtTheMuseum {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = 97;
        int move  = 0;
        String value = input.next();
        
        for(int i=0; i<value.length(); i++){
            int charac = Math.abs(value.toCharArray()[i] - start);
             System.out.println(charac);
           if(charac <= 13){
               move += charac;
           }else{
               move += 26 - charac;
           }
           
           start = value.toCharArray()[i];
        }
        
        System.out.print(move);
      }
}
