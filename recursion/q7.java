public class q7 {
    public static String reverse(int n, String ans){
        if(n == 0) return ans;
        int aa = n/10;
        int ab = n%10;
        if(n%10 != 0) ans += ab;
        String answer = reverse(aa, ans);
        return answer;
    }
    public static void main(String[] args) {
        int ak = 12040500; // 5421
        String ans = reverse(ak,"");
        System.out.println(ans);
    }
}
