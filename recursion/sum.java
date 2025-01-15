
public class sum {

    // parameterised method
    // public static void sum(int n, int ans){
    //     if(n == 0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     sum(n-1,ans+n);  // call and work
    // }

    // return type(recurence relation)
    public static int sum(int s){
        if(s == 0) return 0;
        return s + sum(s-1); 
    }
    public static void main(String[] args) {
        int ans = sum(45);
        System.out.println(ans);
    }
}
