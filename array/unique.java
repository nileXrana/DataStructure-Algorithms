public class unique {
    public static void main(String[] args) {
        int[] nums = {1,3,5,67,1,5,9,3,9};
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] >= nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int x : nums){
            System.out.print(x+" ");
        }
        
        int a = 0;
        int b = 1;
        while(a < n && b < n){
            if(nums[a] == nums[b]){
                a += 2;
                b += 2;
            }
            else{
                System.out.println(nums[a]);
                break;
            }
        }
        System.out.println();
        if(a == n - 1) System.out.println(nums[a]);
        

    }
}
