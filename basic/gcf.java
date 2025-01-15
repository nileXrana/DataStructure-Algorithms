public class gcf {
    public static int fact(int a, int b){
        // T.C. = O(min(a,b))
        for(int i = Math.min(a,b); i > 0; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(fact(12,4));
    }
}
