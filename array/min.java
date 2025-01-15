public class min {
    public static void main(String[] args) {
        int[]nums = {5,3,2,9,10,2,75,3};
        int min = nums[0];
        int i = 1;
        while(i < nums.length){
            min = Math.min(min,nums[i]);
            i++;
        }
        System.out.println(min);
    }
}
