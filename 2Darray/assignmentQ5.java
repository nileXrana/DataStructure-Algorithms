public class assignmentQ5 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j <= i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //////////////............................................
        for(int i = 0; i < n; i++){
            int a = m - 1;
            for(int j = 0; j < m/2; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[a][i];
                arr[a][i] = temp;
                a--;
            }
        }
        System.out.println();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
