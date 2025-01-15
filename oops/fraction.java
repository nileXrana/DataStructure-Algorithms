
public class fraction {
    public static Fraction multiply(Fraction f1, Fraction f2){
        int n = f1.num * f2.num;
        int d = f1.den * f2.den;
        Fraction f5 = new Fraction(n,d);
        return f5;
    }
    public static Fraction divide(Fraction f1, Fraction f2){
        int n = f1.num*f2.den;
        int d = f1.den*f2.num;
        Fraction f6 = new Fraction(n,d);
        return f6;
    }
    public static Fraction subtract(Fraction f1, Fraction f2){
        int n = f1.num*f2.den - f1.den*f2.num;
        int d = f1.den*f2.den;
        Fraction f4 = new Fraction(n,d);
        return f4;
    }
    public static void add(Fraction f1, Fraction f2){
        int n = f1.num*f2.den + f1.den*f2.num;
        int d = f1.den * f2.den;
        // Fraction f3 = new Fraction(n,d);
        // return f3;
        f1.num = n;
        f1.den = d;
    }
    public static class Fraction{ // just a blueprint
        int num;
        int den;

        public Fraction(int num, int den){ // constructor
            this.num = num;
            this.den = den;
            simplify();
        }
        public int gcd(int num, int den){ //gcd
            for(int i = Math.min(num,den); i > 0; i--){
                if(num % i == 0 && den % i == 0) return i;
            }
            return 1;
        }
        public void simplify(){ // simplify
            int hcf = gcd(num,den);
            this.num /= hcf;
            this.den /= hcf;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(12,4); //constructor
        System.out.println(f1.num+"/"+f1.den);
        Fraction f2 = new Fraction(4,2);
        System.out.println(f2.num+"/"+f2.den);
        Fraction f4 = subtract(f1,f2);
        System.out.println(f4.num+"/"+f4.den);
        Fraction f5 = multiply(f1,f2);
        System.out.println(f5.num+"/"+f5.den);
        Fraction f6 = divide(f1,f2);
        System.out.println(f6.num+"/"+f6.den);
        add(f1,f2);
        System.out.println(f1.num+"/"+f1.den);


    }
}
