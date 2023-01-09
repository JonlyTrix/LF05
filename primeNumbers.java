

public class primeNumbers {
public static void main(String[] args) throws InterruptedException{
    int x = 1;
    while(true){
    x = x+1;
    for(int i=1; i<=x; i=i+1) {
            
        if(x%i==0 && i!=x&&i!=1 || x == 1){
            break;

            }
        else if(i/x==1){
            System.out.println(x+ " ist ne Primzahl");
            Thread.sleep(100);
                
            }
        }
       
    }
    
    
}   
}
