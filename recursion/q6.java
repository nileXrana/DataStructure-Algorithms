public class q6 {
    public static void sumArrays(int[] arr){
        if(arr.length == 1) return;
        int[] brr = new int[arr.length-1];
        for(int i = 0; i < brr.length; i++){
            brr[i] = arr[i] + arr[i+1];
        }
        for(int i = 0; i < brr.length; i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        sumArrays(brr);






















    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sumArrays(arr);
    }
}
