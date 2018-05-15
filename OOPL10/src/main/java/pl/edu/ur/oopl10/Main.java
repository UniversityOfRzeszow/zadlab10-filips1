package pl.edu.ur.oopl10;
import java.util.Scanner;
/**
 *
 * @author mchla
 */
public class Main {
  

    public static void main(String[] args) {
        //1
        Scanner odczyt = new Scanner(System.in);
              System.out.println("Wpisz liczbę");
              WprowadzZKonsoli.wprowadzInt();
        //2
        double[] tab = new double[10];
        try {
            tab[10] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nieprawidłowy indeks tablicy,"+ " wyjątek: " + e);
        }
        //3
       try {
            zad3.test();
        } catch (ArithmeticException e) {
            System.out.println("Zlapany ponownie");
        }  
   
    }
}
