public class setMatrix_zeros {
    public static void main(String[] args) {
        // THIS IS A FAILED METHOD(not possible)         
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 0) arr[i][j] = -100;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == -100){
                    for(int k = 0; k < n; k++){
                        arr[i][k] = 0;
                    } 
                    for(int l = 0; l < m; l++){
                        arr[l][j] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
