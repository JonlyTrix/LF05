import java.util.Scanner;
public class Haendler {

    public static void main(String[] args) {
        // Benutzereingaben lesen
        String artikel = liesString("was möchten Sie bestellen?");
        int anzahl = liesInt("Geben Sie die Anzahl ein:");
        double preis = liesDouble("Geben Sie den Nettopreis ein:");
        double mwst = liesDouble("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
        double gesamt = berechneGesamtnettopreis(anzahl, preis);
        double brutto = berechneGesamtbruttopreis(gesamt, mwst);
        rechungausgeben(artikel, anzahl, gesamt, brutto, mwst);
        // Ausgeben
    }
    public static double berechneGesamtnettopreis(int anzahl, double nettopreis){
        double nettogesamtpreis = anzahl * nettopreis;
        return nettogesamtpreis;

    }
    public static double berechneGesamtbruttopreis(double gesamt, double mwst){
        double bruttogesamtpreis = gesamt * (1 + mwst / 100);
        return bruttogesamtpreis;
        
    }
    public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst){
        System.out.println("\tRechnung");
        System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }
    public static double liesDouble(String text)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(text);
        double preis = myScanner.nextDouble();
        return preis;
    }
    public static String liesString(String text)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(text);
        String preis = myScanner.next();

        return preis;
    }
    public static int liesInt(String text)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(text);
        int preis = myScanner.nextInt();
        
        return preis;
    }

}