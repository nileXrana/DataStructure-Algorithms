public class mazePath {
    public static int maze(int m, int n){
        if(m == 1 || n == 1) return 1;
        return maze(m,n-1) + maze(m-1,n);
    }
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }
}
