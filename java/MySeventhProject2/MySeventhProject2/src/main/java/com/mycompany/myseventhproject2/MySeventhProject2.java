/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myseventhproject2;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MySeventhProject2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
//        FileWriter fw = new FileWriter("test44.txt",true); 
//        try (BufferedWriter bw = new BufferedWriter((fw))) {
//            bw.write(98);
//            bw.newLine();
//            bw.write("dd");
//            bw.flush();
//        }
            
//-----------------------
//  BufferedReader br = new BufferedReader(new FileReader("test44.txt"));
//  String line = br.readLine();
//  System.out.println(line);
//------------------------------------------
    BufferedReader br = new BufferedReader(new FileReader("test44.txt"));
  String line = br.readLine();
 // System.out.println(line);
  while(line != null){
      System.out.println(line);
      line = br.readLine();
  }
        }
}
