/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mysecoundproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author DAR-M
 */
public class MySecoundProject {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        System.out.println("Hello World!");
           FileOutputStream fos = new FileOutputStream("test.txt");
       fos.write("يلبيلل".getBytes("UTF-8"));
       fos.flush();
        fos.write("abc".getBytes());
        fos.write("10".getBytes());
        FileInputStream fis = new FileInputStream("test.txt");
        System.out.println(fis.read());
    }
}
