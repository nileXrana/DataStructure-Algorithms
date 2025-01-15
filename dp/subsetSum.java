public class subsetSum {
    public static boolean subset(int i, int[] arr, int target){
        if(i == arr.length){
            if(target == 0) return true;
            else return false;
        }
        boolean skip = subset(i+1,arr,target);
        if(target < 0) return skip; // only valid for +ve numbers
        boolean take = subset(i+1,arr,target-arr[i]);
        return take || skip; 
    }
    public static void main(String[] args) {
        int[] arr = {0,8,5,2,4};
        int target = 7; 
        System.out.println(subset(0,arr,target));
    }
}
