/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Laptop
 */
public class CB04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();    
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        if(b==0){
            System.out.println("INF");
        }
        else
            System.out.println((float)a/b);
    }
}
