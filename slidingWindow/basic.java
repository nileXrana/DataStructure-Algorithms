
public class basic {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 3;
        int i = 0;
        int j = k-1;
        int sum = 0;
        for(int a = 0; a < k; a++){
            sum += arr[a];
        }
        i++; j++;
        int mxSum = sum;
        while(j < arr.length){
            sum = sum - arr[i-1] + arr[j];
            mxSum = Math.max(mxSum,sum);
            i++; j++;
        }
        System.out.println(mxSum);
    }
}
