/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mysixthproject;

//import java.io.File;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DAR-M
 */
public class MySixthProject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Hello World!");
//        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
//            String s = "hello";
//            byte b[] =s.getBytes();
//            fos.write(b);
 //       }
// -------------------------------------
//          String s ="hellotwo";
//        try (FileWriter fr = new FileWriter("test.txt")) {
//            fr.write(s);
           // fr.write(s, 1, 2);
//           fr.write(97);
//             fr.write('b');
//fr.write("bb\n");
//fr.write("dd");
 //       }
//---------------------------------------------------------------------
File file = new File("test.txt");
FileReader fr = new FileReader(file);
//int j ;
//while((j=fr.read())!=-1)
//  //  System.out.println((char)j);
//    System.out.println(j);
//-----------------------------------------------------------
char []ch = new char[(int)file.length()];
fr.read(ch);
for(char c: ch)
    System.out.println(c);

  

        
       
    }
}
