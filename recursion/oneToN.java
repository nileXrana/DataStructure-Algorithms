
public class oneToN {
    public static void print(int n){
        if(n == 0) return; // base case
        print(n-1);  // call
        System.out.println(n); // work
    }
    public static void main(String[] args) {
        print(10);
    }
}
