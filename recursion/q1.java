public class q1 {
    public static int sum(int a, int b){
        if(a == b) return a;
        if(a % 2 == 0) a++;
        if(b % 2 == 0) b--;
        int ans = sum(a+2,b);
        return ans + a;
    }
    public static void main(String[] args) {
        int ans = sum(6,12);
        System.out.println(ans);
    }
}
