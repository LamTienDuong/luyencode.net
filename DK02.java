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
public class DK02 {
    public static void main(String[] args) {
        int a, b, c, max;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        max = a;
        if(b>a){
            max = b;
            if(c>b)
                max = c;
        }else{
            if(c>a)
                max = c;
        }
        
        System.out.println(max);
            
        
    }
}
