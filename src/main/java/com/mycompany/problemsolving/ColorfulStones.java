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
public class ColorfulStones {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String text1 = scanner.next();
      String text2 = scanner.next();
      int counter = 1;
      int x       = 0 ;
      for(int i=0; i< text2.length(); i++){
          if(text1.toCharArray()[x] == text2.toCharArray()[i]){
              counter++;
              x++;
          }
      }
      
      System.out.print(counter);
    }
}
