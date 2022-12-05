public class schleife {
    
    static void fschleife() {
        for(int i=10; i<=20; i=i+1) {
            System.out.printf("%d ", i*i);
      }
    }
    
    static void whileSchleife(){
        int i = 10;
        while(i <= 20) {
            i = i+1;
            if (i == 15) break; //break bricht die Schleife ab.
            if (i == 12) continue; //continue springt zum nächsten durchlauf der schleife
            System.out.printf("%d ", i*i);
            i = i+1;
        }


    }
    public static void main(String[] args) {
        System.out.println("for");
        fschleife();
        System.out.println("while");
        whileSchleife();
        
    }
    
}
