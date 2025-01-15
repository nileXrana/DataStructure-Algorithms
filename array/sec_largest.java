public class sec_largest {
    public static void main(String[] args){
        int[] arr = {2,17,1,2,1,8};
        int a = 0;
        int b = 1;
        // index mei variable khelte hai
        while(a < arr.length && b < arr.length){
            if(arr[a] >= arr[b]){
                b++;
            }
            else a++;
        }
        
        int mx = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(i != a){
                mx = Math.max(mx,arr[i]);
            }
        }
        System.out.println(mx+" ");
        
        


    }
}
