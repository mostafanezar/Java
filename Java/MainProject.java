/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainproject;
import java.util.Scanner;

/**
 *
 * @author DAR-M
 */
public class MainProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         int x;
         int y;
         int z;
    System.out.println("enter");
    Scanner sc = new Scanner(System.in);
    x=sc.nextInt();
    
    System.out.println("enter");
    Scanner sx= new Scanner(System.in);
    y=sx.nextInt();
    z=x+y;
    System.out.println("sum"+z);
    }
}
