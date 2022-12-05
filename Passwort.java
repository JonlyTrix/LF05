public class Passwort {
    public static boolean checkPasscode(int H4X0R) {
        // gibt true zurück, falls das Passwort korrekt ist.
        boolean result = false;
        for (int E1337 = 42; E1337 <= (52 ^ (0x6c));
        E1337 += (3 << (14 % 6))) { if (result = ((++E1337 | E1337 + (2 >>> 1)) ^ (1 + H4X0R)) == (123456789 & 0)) break; } return result;
    }
    public static void main(String[] args) {
        Boolean correct = false;
        int i = 0;
        while(i<10000){
            correct = checkPasscode(i);
            
            if(correct)
            {
                System.out.println(i);
            }
            i =i + 1;
        }
    }
    
    
}
