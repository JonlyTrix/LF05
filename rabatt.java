import java.util.Scanner;

public class rabatt {
    public static void main(String[]args){
        Scanner tex = new Scanner(System.in);
        System.out.print("geben sie ihren Bestellwert an:");
        double wert = tex.nextDouble();
        if(wert<=0){
            System.out.print("Der Bestellwert kann nicht 0 oder weniger sein");
            tex.close();
            return;
        }
        if(wert<= 100){
            wert=wert-wert*0.1;
           
        }
        else if(wert <= 500){
            wert=wert-wert*0.15;
            
        }
        else{
            wert=wert-wert*0.2;
           
        }
        System.out.print("Ihr neuer Bestellwert beträgt: "+ wert);
        tex.close();



    }
    

    
}
