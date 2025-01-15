

public class factorial {
    public static int fact(int n){
        if(n == 1 || n == 0) return 1; // base case
        return n * fact(n-1); // recursive call
    }
    public static void main(String[] args) {
        int n = fact(0);
        System.out.println(n);
    }
}
