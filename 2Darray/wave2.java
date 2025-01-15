
public class wave2 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int m = arr.length;
        int n = arr[0].length;
        // to print the 2d array
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        // wave form 1(row wise)
        for(int i = 0; i < m; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int k = n - 1; k >= 0; k--){
                    System.out.print(arr[i][k]+" ");
                }
            }
        }
        System.out.println();

        //wave form 2(row wise)
        for(int i = 0; i < m; i++){
            if(i % 2 != 0){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int k = n - 1; k >= 0; k--){
                    System.out.print(arr[i][k]+" ");
                }
            }
        }
        System.out.println();

        //wave form 3(column wise)
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int k = m - 1; k >= 0; k--){
                    System.out.print(arr[k][i]+" ");
                }
            }
        }
        System.out.println();

        //wave form 4(column wise)
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int k = m - 1; k >= 0; k--){
                    System.out.print(arr[k][i]+" ");
                }
            }
        }



    }
}
