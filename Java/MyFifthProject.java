/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.myfifthproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MyFifthProject {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
   // File f = new File("folder/1/2");
//        f.mkdir();
//        f.mkdirs();
//        f.delete();
//File f = new File("xolder");
//     String [] arr =   f.list();
//     if(f.isDirectory())
//     for(String s:arr)
//     System.out.println(s);
//----------------------------------------------
//       File f2 = new File("xolder");        
//         File f4 = new File(f2,"y2.txt");
//        f4.createNewFile();
//-----------------------------------------------------
 File f2 = new File("xolder");    
 File f4 = new File(f2,"yyyyyyyy.txt");
         FileOutputStream fos = new FileOutputStream(f4);
         fos.write("xxxx".getBytes());
         FileInputStream fin = new FileInputStream(f4);
         int j;
         while((j=fin.read()) !=-1)
             System.out.println((char)j); 
}
}
