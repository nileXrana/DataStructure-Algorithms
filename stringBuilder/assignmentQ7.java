public class assignmentQ7 {
    public static void main(String[] args) {
        String str = "134319441324";
        int mx = (int)str.charAt(0) - 48;
        for(int i = 1; i < str.length(); i++){
            mx = Math.max(mx,(int)str.charAt(i) - 48);
        }
        
        System.out.println(mx);

    }
}
