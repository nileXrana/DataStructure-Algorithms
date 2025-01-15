public class pallindrome {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int n = arr.length;
        int a = 0;
        int b = n - 1;
        boolean bool = true;
        while(a < b){
            if(arr[a] == arr[b]){
                a++;
                b--;
            }
            else{
                bool = false;
                break;
            }
        }
        if(bool == true) System.out.println("pallindrome");
        else System.out.println("not a pallindrome");

    }
}
