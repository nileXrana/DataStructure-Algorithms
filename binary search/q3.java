public class q3 {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1},{0,0,1,1},{0,1,1,1},{1,1,1,1}};
        int m = arr.length;
        int n = arr[0].length;
        int[] brr = new int[m];
        for(int i = 0; i < m; i++){
            int low = 0;
            int high = n-1;
            int lb = n;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(arr[i][mid] == 1){
                    lb = Math.min(lb,mid);
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            brr[i] = n-lb;
        }
        int i = 0; 
        int j = 1;
        while(j<brr.length){
            if(brr[i] >= brr[j]) j++;
            else i = j;
        }
        System.out.println(i);
    
    }
}
