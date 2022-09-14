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
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int number = input.nextInt();
        int i,fact=1;
        for(i=1;i<=number;i++){   
            fact *= i;   
        } 
       
        if(fact % 2 == 0){
            System.out.print("YES");
        }else{
             System.out.print("NO");
        }
        
    }
}
