/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

/**
 *
 * @author student
 */
public class zad3 extends java.lang.Exception{
    
    
    static void test(){
       try {
           System.out.println("Wyjatek dzielenia przez 0 wprowadzony" );
               int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Wyjatek dzielenia przez 0 wykryty" );
            throw e;
    }
    
    
}
}