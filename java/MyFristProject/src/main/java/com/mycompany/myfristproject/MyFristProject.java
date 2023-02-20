/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfristproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MyFristProject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Hello World!");
          FileInputStream fis = new FileInputStream("D:/java/x.txt");
        byte [] b = new byte[3];
        fis.read(b);
        String s = new String(b);
        System.out.println(s);
        
        
//        int data;
//        while( (data =fis.read())!=-1)
//        {
//          System.out.println( (char)data);
//        }
//     System.out.println( fis.read());
//       System.out.println( (char)fis.read());
//         System.out.println( (char)fis.read());
//           System.out.println( (char)fis.read());
//            System.out.println( (char)fis.read());
//  System.out.println( fis.read());
    }
}
