public class stringTravel {
    public static void printString(int n, String str, String ans){
        if(n == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(n) != 'a') ans += str.charAt(n);
        printString(n+1,str,ans);
    }
    public static void main(String[] args) {
        // remove a
        String str = "akhil rana";
        printString(0,str,"");
    }
}
