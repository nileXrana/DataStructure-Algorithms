public class subarraySum {
    public static void main(String[] args) {
        // v.v. important 
        int[] arr = {1,2,1};
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += (arr[i]*(i+1)*(n-i));
        }
        System.out.println(sum);
    }
}
