public class sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4};
        int a = 0;
        int b = 1;
        int ak = 0;
        while(a < arr.length && b < arr.length){
            if(arr[b] >= arr[a]){
                a++;
                b++;
            }
            else{
                ak = 1;
                break;
            }
        }

        if(ak == 1) System.out.println("not sorted");
        else System.out.println("sorted");

        


    }
}
