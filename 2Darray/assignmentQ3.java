public class assignmentQ3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{40,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        int mx = arr[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                mx = Math.max(arr[i][j],mx);
            }
        }
        System.out.println(mx);
    }
}
