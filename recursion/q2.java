public class q2 {
    public static int stair(int n){
        if(n == 1 || n == 2) return n;
        if(n == 3) return 4;
        int a = stair(n-1);
        int b = stair(n-2);
        int c = stair(n-3);
        return a+b+c;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = stair(n);
        System.out.println(ans);
    }
}
