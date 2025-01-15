public class q3 {
    public static void ispow(int a, int b){
        if(a == b){
            System.out.println("true");
            return;
        }
        if(a > b){
            System.out.println("false");
            return;
        }
        ispow(a*2,b);
    }
    public static void main(String[] args) {
        int n = 128;
        ispow(2,n);
    }
}
