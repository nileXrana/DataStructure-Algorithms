import java.util.*;
public class nextGreater {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        int[] brr = new int[n];
        brr[n-1] = -1;
        for(int i = n-2; i >= 0; i--){
            if(st.peek() > arr[i]){
                brr[i] = st.peek();
            }
            else{
                while(st.size() > 0 && st.peek() < arr[i]){
                    st.pop();
                }
                if(st.size() == 0) brr[i] = -1;
                else{
                    brr[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        for(int ele : brr){
            System.out.print(ele+" ");
        }

    }
}
