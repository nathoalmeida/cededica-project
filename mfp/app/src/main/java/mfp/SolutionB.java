/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfp;
import java.util.Scanner;

/**
 *
 * @author nathoalmeida
 */
public class SolutionB {
    
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
        int[] v = new int[7];
        int s;
        int total = 0;
        
       for(int i = 0; i < 7; i++) {
           v[i] = scan.nextInt();
       }
        s = scan.nextInt();
       
       for(int j = 0; j < 7; j++) {
           if (v[j] == 1) {
               total++;
           }
       } 
          
           if(total%2 != 0 && s == 0)  {
               System.out.println("S");
           } else if(total%2 == 0 && s == 1) {
               System.out.println("S");
           } else {
               System.out.println("N?");
           }
       }
        
    }
    

