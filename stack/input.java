import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("enter number of elements : ");
        int n = sc.nextInt();
        System.out.print("enter elements : ");
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            st.push(a);
        }
        System.out.println(st);
        // reverse order
        Stack<Integer> st2 = new Stack<>();
        while(st.size() != 0){
            st2.push(st.pop());
        }
        System.out.println(st2);
        // reverse again to get original order
        Stack<Integer> st3 = new Stack<>();
        while(st2.size() != 0){
            st3.push(st2.pop());
        }
        System.out.println(st3);
        // now we have copy of st in st3
    }
}
