import java.util.Scanner;

public class Weltreise {
    public static void main(String[] args) {
        double geld = liesDouble("Budget:");
        double grenze = liesDouble("Eiserne Grenze:");
        USA(geld);
        Japan(geld);
        England(geld);
        Schweiz(geld);
        Daenemark(geld);
        while(geld>grenze){
            double preis = liesDouble("preis:");
            Double a = Ausgabe(geld, preis);
            geld = a;
            System.out.println("Restbudget: " + a );
            USA(a);
            Japan(a);
            England(a);
            Schweiz(a);
            Daenemark(a);
        }
        System.out.print("Geh nach Hause!!");


        
    }
    public static Double Ausgabe(Double geld, double preis){
        Double rest = geld - preis;

        return rest;
    }
    public static Double USA(Double geld){
        Double rest = geld * 0.98;
        rest = Math.round(rest * 100) / 100.0d;
        System.out.println("Budget in USA:" + rest);
        return rest;
    }
    public static Double Japan(Double geld){
        Double rest = geld * 147;
        rest = Math.round(rest * 100) / 100.0d;
        System.out.println("Budget in Japan:" + rest);
        return rest;
    }
    public static Double England(Double geld){
        Double rest = geld * 0.88;
        rest = Math.round(rest * 100) / 100.0d;
        System.out.println("Budget in England:" + rest);
        return rest;
    }
    public static Double Schweiz(Double geld){
        Double rest = geld * 0.96;
        rest = Math.round(rest * 100) / 100.0d;
        System.out.println("Budget in der Schweiz:" + rest);
        return rest;
    }
    public static Double Daenemark(Double geld){
        Double rest = geld * 7.44;
        rest = Math.round(rest * 100) / 100.0d;
        System.out.println("Budget in Daenemark:" + rest);
        return rest;
    }
    public static double liesDouble(String text)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(text);
        double mon = myScanner.nextDouble();
        return mon;
    }
}
