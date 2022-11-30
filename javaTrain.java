import java.util.Scanner;

public class javaTrain {
    public static void train(){
        Scanner tex = new Scanner(System.in);
        int fahrzeit = 8;
        System.out.println("Hält der Zug in Spandau?");
        char spandau = tex.next().charAt(0);
        
        if (spandau == 'j'){
            fahrzeit = fahrzeit + 2;
        }
        System.out.println("Ist die Weiche richtung Hamburg gestellt?");
        char hamburg = tex.next().charAt(0);
        if (hamburg == 'j'){
            fahrzeit = fahrzeit + 96;
            System.out.println("Sie kommen nach " + fahrzeit + " Minuten in Hamburg an.");
            tex.close();
            return;
        }
        else if(hamburg == 'n'){
            fahrzeit = fahrzeit + 34;
            System.out.println("Fährt der Zug über Stendal Hbf?");
            char stendalHbf = tex.next().charAt(0);
        if(stendalHbf == 'j'){
            fahrzeit = fahrzeit + 16;
        }
        else if(stendalHbf == 'n'){
            fahrzeit = fahrzeit + 6;
        }
        System.out.println("Endet der Zug in Wolfsburg?");
        char wolfsburg = tex.next().charAt(0);
        if(wolfsburg == 'j'){
            fahrzeit = fahrzeit + 29;
            System.out.println("Sie kommen nach "+fahrzeit+" Minuten in Wolfsburg an.");
            tex.close();
            return;
        }
        else if(wolfsburg=='n'){
            System.out.println("Fährt der Zug richtung Braunschweig?");
            char braunschweig = tex.next().charAt(0);
            if(braunschweig == 'j'){
                fahrzeit = fahrzeit + 50;
                System.out.println("Sie kommen nach "+fahrzeit+" Minuten in Braunschweig an.");
                tex.close();
                return;
            }

            else if(braunschweig=='n'){
                fahrzeit = fahrzeit + 62;
                System.out.println("Sie kommen nach "+fahrzeit+" Minuten in Hannover an.");
                tex.close();
                return;
            }
        }
        tex.close();
        }      
    }
    public static void main(String[]args){
        javaTrain.train();
    }
}
       
   

    


            

            
    

        
        



        




    
    

