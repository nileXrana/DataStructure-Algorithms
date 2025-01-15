public class assignmentQ1 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int m = arr.length;
        int n = arr[0].length;
        // sab mei 10 dal do
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = 10;
            }
        }
        // print kar do
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
