import java.util.Scanner;
public class groessterWert {

   public static void main(String[] args) {
      Scanner Tastatur = new Scanner(System.in);
      int a, b, c, max;

      // Eingabe
      System.out.print("a: ");
      a = Tastatur.nextInt();
      System.out.print("b: ");
      b = Tastatur.nextInt();
      System.out.print("c: ");
      c = Tastatur.nextInt();
     
      // Verabeitung
      if (a > b )  {
          if (a>c ) {
             max = a;
          }
          else {
             max = c;
         }
      }
      else {
          if (b>c ) {
            max = b;
          }
         else {
            max = c;
         }
      }
     System.out.println("Der größte eingegebene Wert ist: " + max);
   }
}