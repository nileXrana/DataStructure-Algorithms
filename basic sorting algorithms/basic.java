
public class basic {
    public static void main(String[] args) {
        int[] arr = {1,1,5,7};
        // check weather sorted or not
        int a = arr[0];
        int b = arr[1];
        boolean bool = true;
        while(b < arr.length){
            if(arr[a] <= arr[b]){
                a++;
                b++;
            }
            else{
                bool = false;
                break;
            }
        }
        if(bool == true) System.out.println("sorted");
        else System.out.println("not sorted");
    }
}
