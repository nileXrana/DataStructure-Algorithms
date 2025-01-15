

public class power {
    // public static int pow(int a, int b){
    //     if(b == 0) return 1;
    //     return a * pow(a,b-1);
    // }
    public static int pow2(int a, int b){
        if(b == 0) return 1;
        int ans = pow2(a,b/2);
        if(b % 2 == 0) return ans * ans;
        else return (ans * ans) * a;
    }
    public static void main(String[] args) {
        int ak = pow2(2,5);
        System.out.println(ak);
    }
}
