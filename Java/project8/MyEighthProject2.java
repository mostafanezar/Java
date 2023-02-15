/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myeighthproject2;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MyEighthProject2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        FileWriter fr = new FileWriter("test.txt");
        PrintWriter pw = new PrintWriter(fr,true);
        
        
//        pw.println(98);
//        pw.println("ddd");
//        pw.println('d');
//        pw.print(true);
//        pw.flush();

//        pw.println(2048);
//        pw.println("bb");
//        pw.println('b');
//        pw.print(false);
//        pw.flush();

          pw.println(98);
          pw.write(98);
          pw.flush();
          pw.close();
    }
}
