public class missing_smallest {
    public static void main(String[] args) {
        int[] arr = {1,1,2,-2,4,3};
        int ak = 1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            boolean bool = false;
            for(int j = 0; j < n; j++){
                if(arr[j] == ak) bool = true;
            }    
            if(bool == false){
                System.out.println(ak);
                break;
            }
            else ak++;

        }
     
        


    }
}
