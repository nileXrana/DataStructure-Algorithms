public class permutation {
    public static void permu(String ans , String s){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String before = s.substring(0,i);
            String after = s.substring(i+1);
            permu(ans+ch,before+after);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permu("",s);
    }
}
