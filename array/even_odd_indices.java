public class even_odd_indices {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int sumofeven = 0;
        int sumofodd = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0) sumofeven += nums[i];
            else sumofodd += nums[i];
        }

        if(sumofeven >= sumofodd) System.out.println(sumofeven - sumofodd);
        else System.out.println(sumofodd - sumofeven);
    }
}
