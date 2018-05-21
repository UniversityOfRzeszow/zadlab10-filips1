/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class zad5  {
    public static void nint(){
        Scanner odczyt = new Scanner(System.in); 
         try {
            System.out.println("Podaj int");
            int a = odczyt.nextInt();
            FileReader fr = new FileReader("t.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("t2.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.print("Wyjątek: ");
            System.out.println(e.getMessage());
        }
    }
          public static void nstr(){
        Scanner odczyt = new Scanner(System.in); 
         try {
            System.out.println("Podaj ciąg znaków");
            String a = odczyt.nextLine();
            FileReader fr = new FileReader("t.txt");
            BufferedReader br = new BufferedReader(fr);
            String output = br.readLine();
            br.close();
            FileWriter fwo = new FileWriter("t2.txt");
            BufferedWriter bwo = new BufferedWriter(fwo);
            bwo.write(a);
            bwo.newLine();
            bwo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.print("Wyjątek: ");
            System.out.println(e.getMessage());
        }
    }

}
