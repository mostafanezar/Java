/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mythirdproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MyThirdProject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Hello World!");
         File file = new File("D:\\java\\icons8-globe-50.png"); 
        try (FileInputStream fin = new FileInputStream(file)) {
            byte b[] = new byte[(int)file.length()];
            fin.read(b);
            
            for(int i=0;i<b.length;i++)
                System.out.println(b[i]);
            
            
            try (FileOutputStream fos = new FileOutputStream("D:\\java\\icons8-globe-503.png")) {
                fos.write(b);
                fos.flush();
            }
        }
    }
}
