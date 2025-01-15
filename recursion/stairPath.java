public class stairPath {
    public static int stair(int n){
        if(n == 0 || n == 1) return n;
        else if(n == 2 || n == 3) return n-1;
        return stair(n-1) + stair(n-3);
    }
    public static void main(String[] args) {
        // stair allowed at a time : 1 or 3
        System.out.println(stair(5));
    }
}
