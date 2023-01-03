import java.util.Scanner;

public class primeNumbers {
public static void main(String[] args) {
   
    while(true){
    int x;
    Scanner tastatur = new Scanner(System.in);
    System.out.print("Zahl:");
    x = tastatur.nextInt();
    for(int i=1; i<=x; i=i+1) {
            
        if(x%i==0 && i!=x&&i!=1 || x == 1){
            System.out.println("keine Primzahl... Teilbar durch: " + i);
            break;
            }
        else if(i/x==1){
            System.out.println("ist ne Primzahl");
            break;
                
            }
        }
       
    }
    
    
}   
}
