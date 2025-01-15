import java.util.*;
public class consecutiveSeq{
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]); 
        for(int i = 1; i < n; i++){
            if(arr[i] != st.peek()){
                st.push(arr[i]);
            }
            else{
                if(arr[i] != arr[i+1]) st.pop();
            }
        } 
        int[] brr = new int[st.size()];
        for(int i = brr.length-1; i >= 0; i--){
            brr[i] = st.peek();
            st.pop();
        }
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}