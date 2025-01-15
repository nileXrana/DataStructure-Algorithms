//import java.math.BigInteger;
import java.math.*;
public class factorial {
    public static void main(String[] args) {
        BigInteger fact = BigInteger.ONE;
        int n = 100;
        for(int i = 1; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

    }
}
