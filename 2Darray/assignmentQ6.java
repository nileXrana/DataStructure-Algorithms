class assignmentQ6{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = m - 1; j >= 0; j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int k = 0; k < m; k++){
                    System.out.print(arr[k][i]+" ");
                }
            }
        }
    }
}