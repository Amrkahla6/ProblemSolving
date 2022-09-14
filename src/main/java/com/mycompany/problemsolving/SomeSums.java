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
public class SomeSums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum  = 0;
        for(int i = 0; i<=num1; i++){
            if(i/10 == 0){
                if (i >= num2 && i <= num3) {
                    sum +=i;
                }
            }else{
                 int number = i; 
                 int mysum  = 0;
                 
                 while (number !=0) { // 15
                    int mynum = number%10; // 1
                    mysum += mynum; // 5 + 1
                    number /= 10;   // 15 / 10 = 1
                }
                 if(mysum >= num2 && mysum <= num3){
                    sum += i;
                }
            }
           
        }
          System.out.println(sum);
    }
    
}
