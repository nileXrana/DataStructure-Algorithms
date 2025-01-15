public class hw {
    public static void call(int a, int k, int n, String ans){
        if(ans.length() == k || a == n ){
            System.out.println(ans);
            return;
        }
        call(a+1,k,n,ans);
        call(a+1,k,n,ans+a);
    }
    public static void main(String[] args) {
        int n = 6;
        int k = 4;
        int a = 1;
        call(a,k,n,"");
    }
}
