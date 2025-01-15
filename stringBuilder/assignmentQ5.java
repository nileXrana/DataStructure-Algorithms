public class assignmentQ5 {
    public static void main(String[] args) {
        // integer.parseInt()
        // Integer.valueOf()
        String str = "12345";  // 12345
        int n = str.length();
        int m = 1;
        for(int i = 1; i < n; i++){
            m *= 10;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += ((int)str.charAt(i) - 48) * m;
            m /= 10;
        }
        System.out.println(sum);

    }
}
