public class Mittelwert {

    public static void main(String[] args) {
 
       // (E) "Eingabe"
       // Werte für x und y festlegen:
       // ===========================
       double x = 8.0;
       double y = 4.0;
       mitte(x,y);

    }
       
    public static double mitte(double a, double b){
        double c;
        c = (a + b) / 2.0;
        System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", a, b, c);
        return(c);
    }
       
 }