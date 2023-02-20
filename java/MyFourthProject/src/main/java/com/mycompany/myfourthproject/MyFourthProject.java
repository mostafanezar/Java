/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfourthproject;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MyFourthProject {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        File f = new File("x2.txt");
//        URI= Uniform Resourse Identifier -> URL,URN
        System.out.println(f.exists());
        f.createNewFile();
         System.out.println(f.exists());
         if(f.exists());
         System.out.println("file name "+f.getName());
//           System.out.println(f.getAbsoluteFile());
            System.out.println(f.getAbsolutePath());
             System.out.println(f.getPath());
               System.out.println(f.canWrite());
                 System.out.println(f.canRead());
                  System.out.println("length "+f.length());
                   System.out.println(f.isDirectory());
                     System.out.println(f.isFile());
                      System.out.println(f.lastModified());
                       System.out.println(f.canExecute());
         
    }
}
