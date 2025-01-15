public class parenthesis {
    public static void wellFormed(int open, int close, int n, String ans){
        if(ans.length() == 2*n){
            System.out.println(ans);
            return;
        }
        if(open < n) wellFormed(open+1,close,n,ans+'(');
        if(close<open) wellFormed(open,close+1,n,ans+')');
    }
    public static void main(String[] args) {
        int n = 3; // ( ( ( ) ) )
        wellFormed(0,0,n,"");

    }
}
