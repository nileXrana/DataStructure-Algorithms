public class two_pointer {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = i + 1;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //two pointer approach(2 variables) easy
        int a = 0;
        int b = 4;
        while(a <= b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }






    }
}
