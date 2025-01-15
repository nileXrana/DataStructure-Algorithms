public class binaryString {
    public static void binary(String ans, int n){
        if(ans.length() == n){
            System.out.println(ans);
            return;
        }
        int ak = ans.length();
        if(ak > 0 && ans.charAt(ak-1) == '1'){
            binary(ans+0,n);
        }
        else{
            binary(ans+0,n);
            binary(ans+1,n);
        }
        
    }
    public static void main(String[] args) {
        int n = 3;
        binary("",n);
    }
}
