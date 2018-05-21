package pl.edu.ur.oopl10;
import java.util.Random;
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
       //4
       int d=0;int f=0;
       Random losowe = new Random();
       while(d<3){
            int a=losowe.nextInt(20);
             a=a-10;
            int b=losowe.nextInt(20);
             b=b-10;
         try {

             float c=a/b;
        } catch (ArithmeticException e) {
            System.out.println("błąd wystąpiło dzielenie przez 0 ");
            d++;
        }
         if (f==d){
             System.out.println(a+"/"+b+"="+a/b);
         }
         f=d;
    }
       //5
       zad5 a = new zad5();
       zad5.nint();
       zad5.nstr();
}
}