public class assignmentQ2 {
    public static void main(String[] args) {
        String str = "akhil rana rana";
        int n = str.length();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') count--;
            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
