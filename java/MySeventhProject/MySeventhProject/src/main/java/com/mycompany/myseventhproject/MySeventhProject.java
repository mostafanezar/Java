/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myseventhproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MySeventhProject {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        FileWriter fw = new FileWriter("test44.txt"); 
        BufferedWriter bw = new BufferedWriter((fw));
        bw.write(98);
        bw.newLine();
        bw.write("dd");
        bw.flush();
        bw.close();
    }
}
