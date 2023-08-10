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
public class TestSolution {
    
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    
    int a;
    int b;
    int c;
    int m;
    int n;
    
    m = scan.nextInt();
    n = scan.nextInt();
    
    a = (m*m) - (n*n);
    b = 2*m*n;
    c = (m*m) + (n*n);
    
    
    
    
    System.out.print(a);
    System.out.print(b);
    System.out.print(c);
}
    
}
