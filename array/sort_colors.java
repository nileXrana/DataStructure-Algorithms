import java.util.Arrays;

public class sort_colors {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,2,1,2,0};
        int n = arr.length;

        int ones = 0;t zeros = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) zeros++;
            if(arr[i] == 1) ones++;
        }

        for(int i = 0; i < n; i++){
            if(i < zeros) arr[i] = 0;
            else if(i < zeros + ones) arr[i] = 1;
            else arr[i] = 2;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }



    }
}
