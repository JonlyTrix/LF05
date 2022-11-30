import java.util.Scanner;


public class schaltjahr {
    public static void main(String[] args) {
        Scanner tex = new Scanner(System.in);
        System.out.print("Gib deine Jahreszahl ein: ");
        int jahr = tex.nextInt();
        if(jahr>1582){
            if(jahr % 100 == 0){
                if(jahr % 400 == 0){
                    System.out.print("Es handelt sich um ein Schaltjahr");
                }
                else{
                    System.out.print("Es handelt sich um kein Schaltjahr");
                }
            }
        }
        if(jahr % 4 == 0){
            System.out.print("Es handelt sich um ein Schaltjahr");
        }
        else{
            System.out.print("Es handelt sich um kein Schaltjahr");
        }
        tex.close();
    }
    
}
