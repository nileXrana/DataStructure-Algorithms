public class assignmentQ7 {
    public static void main(String[] args) {
        int n = 7;
        int[][] arr = new int[n][n];
        int A = 0;
        int B = n - 1;
        int C = 0;
        int D = n - 1;
        int no = 1;
        while(A <= B && C <= D){
            for(int i = C; i <= D; i++){
                arr[A][i] = no;
                no++;
            }
            A++;
            for(int j = A; j <= B; j++){
                arr[j][D] = no;
                no++;
            }
            D--;
            for(int k = D; k >= C; k--){
                arr[B][k] = no;
                no++;
            }
            B--;
            for(int l = B; l >= A; l--){
                arr[l][C] = no;
                no++;
            }
            C++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
