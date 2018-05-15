/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    
    static  void wprowadzInt (){
    Scanner odczyt = new Scanner(System.in);
      int a;
        try {
            a = odczyt.nextInt();
        } catch (Exception e) {
            System.out.println("Błąd");

        }
    }
    
    
    
    
}
