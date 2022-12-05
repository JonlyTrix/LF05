
import java.util.*;

class Fahrkartenautomat {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);
        int ticketwahl;
        double zuZahlenderBetrag;
        double eingezahlterGesamtbetrag;
        double eingeworfeneMuenze;
        double rueckgabebetrag;
        double nochZuZahlen;
        int ticketAnzahl;
        List<Double> geld = Arrays.asList(0.01, 0.02 , 0.05, 0.1, 0.2 , 0.5, 1.0, 2.0 ,5.0 ,10.0 ,20.0);
        zuZahlenderBetrag = 0.0;
        begruessung();

        // // 1 : Geldbetrag eingeben
        // System.out.print("Zu zahlender Betrag (Euro): ");
        // zuZahlenderBetrag = tastatur.nextDouble();
        System.out.println("Wählen sie die gewünschte Fahrkarte!");
        System.out.println("Kurzstrecke (1) 2,00 Euro");
        System.out.println("Tageskarte VBB-Gesamtnetz (2) 23,00 Euro");
        System.out.println("Einzelfahrschein AB (3) 3,00 Euro");
        System.out.println("Einzelfahrschein BC (4) 3,50 Euro");
        System.out.println("Einzelfahrschein ABC (5) 3,80 Euro");
        // 1.1 : Ticketpreis eingeben
        System.out.print("Ticketwahl: ");
        ticketwahl = tastatur.nextInt();
        switch(ticketwahl)
        {
            case 1:
            zuZahlenderBetrag = 2.00;
            break;    
            case 2:
            zuZahlenderBetrag = 23.00;
            break;          
            case 3:
            zuZahlenderBetrag = 3.00;
            break;
            case 4:
            zuZahlenderBetrag = 3.50;
            break;
            case 5:
            zuZahlenderBetrag = 3.80;
            break;
            default:
            System.out.print("Fehler!!");         
        }

        // 1.2 : Anzahl der Tickets eingeben
        System.out.print("Anzahl der Tickets: ");
        ticketAnzahl = tastatur.nextInt();

        // 4.4 validiere die Anzahl der Tickets
        if (10 < ticketAnzahl || ticketAnzahl < 1) {
            while(10 < ticketAnzahl || ticketAnzahl < 1){
                System.out.println("Ticketanzahl ist nicht gültig! ");
                System.out.print("Anzahl der Tickets: ");
                ticketAnzahl = tastatur.nextInt();

            }
        }

        zuZahlenderBetrag *= ticketAnzahl;

        // 2 : Geldeinwurf
        eingezahlterGesamtbetrag = 0.0;
        nochZuZahlen = 0.0;
        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
            nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f Euro\n", nochZuZahlen);
            System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
            eingeworfeneMuenze = tastatur.nextDouble();
            if(geld.contains(eingeworfeneMuenze)){
                eingezahlterGesamtbetrag += eingeworfeneMuenze;
            }
            else{
                System.out.println("Es werden nur 0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1, 2, 5, 10, 20 akzeptiert!");
            }
        }

        // 3 : Fahrscheinausgabe
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");

        // 4 : Rückgeldberechung und -ausgabe
        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rueckgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n", rueckgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
                System.out.println("2 Euro");
                rueckgabebetrag -= 2.0;
            }
            while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
                System.out.println("1 Euro");
                rueckgabebetrag -= 1.0;
            }
            while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
                System.out.println("50 Cent");
                rueckgabebetrag -= 0.5;
            }
            while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
                System.out.println("20 Cent");
                rueckgabebetrag -= 0.2;
                rueckgabebetrag = roundEuro(rueckgabebetrag);
            }
            while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
                System.out.println("10 Cent");
                rueckgabebetrag -= 0.1;
                rueckgabebetrag = roundEuro(rueckgabebetrag);
            }
            while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
                System.out.println("5 Cent");
                rueckgabebetrag -= 0.05;
                rueckgabebetrag = roundEuro(rueckgabebetrag);
            }
        }

        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                + "Wir wünschen Ihnen eine gute Fahrt.");

        tastatur.close();
    }

    private static double roundEuro(double x) {
        return Math.round(x * 100) / 100.0d;
    }
    public static void begruessung(){
        System.out.println("Herzilich Wilkommen!");
        System.out.println("");
    }
}