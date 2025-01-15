public class assignmentQ4 {
    public static void main(String[] args) {
        String str = "nilesh";  // nilhse
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        int i = n / 2;
        int j = n - 1;
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);

    }
}
