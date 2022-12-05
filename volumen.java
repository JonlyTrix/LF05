public class volumen {
    public static void main(String[] args) {
        double x = 5;
        double y = 10;
        double m = volumenBerechnen(x);
        double n = volumenBerechnen(y);
        System.out.println(m);
        System.out.println(n);
    }
    static double volumenBerechnen(double x){
        double v = x*x*x;
        return v;
    }
    
}
