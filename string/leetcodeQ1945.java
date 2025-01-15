public class leetcodeQ1945{
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;   // 8
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append((int)s.charAt(i) - 96);
        }

        char[] arr = sb.toString().toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (int)arr[i] - 48;
        }

        for(int i = 0; i < k - 1; i++){
            int sum2 = 0;
            while(sum != 0){
                sum2 += sum % 10;
                sum /= 10;
            }
            sum = sum2;
        }
        System.out.println(sum);

    }
}