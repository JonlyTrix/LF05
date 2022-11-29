import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class scanner {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner
        System.out.println("Eine ganze Zahl");
        int ganzzahl= tastatur.nextInt();
        System.out.println("Eine  kommazahl");
        double kommazahl= tastatur.nextDouble();
        System.out.println("Ein Wort");
        String wort= tastatur.next();
        System.out.println("Ein Bool");
        boolean wahrheitswert=tastatur.nextBoolean();
        System.out.println("Ein Char");
        char buchstabe=tastatur.next().charAt(0);

        System.out.println("Sie haben " + ganzzahl + " eingegeben!\n\n");
        System.out.println("Sie haben " + kommazahl + " eingegeben!\n\n");
        System.out.println("Sie haben '" + wort + "' eingegeben!\n\n");
        System.out.println("Sie haben '" + wahrheitswert + "' eingegeben!\n\n");
        System.out.println("Sie haben '" + buchstabe + "' eingegeben!\n");
       
        tastatur.close();
    }
}