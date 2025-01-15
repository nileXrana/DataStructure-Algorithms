import java.util.Arrays;
public class first_non_rep {
    public static void main(String[] args) {
        int[] arr = {7,1,5,6,1,5,7,1,12,6};
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            boolean bool = false;
            for(int j = 0; j < n; j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        bool = true;
                        break;
                    }
                }
            }
            if(bool == false){
                System.out.println(arr[i]);
                break;
            }
        }




    }
}
