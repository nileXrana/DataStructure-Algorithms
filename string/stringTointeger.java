public class stringTointeger{
    public static int convert(char a){
        int ans = (int)a - 48;
        return ans;
    }
    public static void main(String[] args) {
        String ak = "nilesh";
        String bk = new String("nilesh");
        System.out.println(ak==bk);
        
    }
}