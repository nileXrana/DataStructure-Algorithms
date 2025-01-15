public class three_sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int n = nums.length;
        int x = 10;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == x){
                        System.out.print(nums[i]+" "+nums[j]+" "+nums[k]);
                        System.out.println();
                    }
                }
            }
        }






    }
}
