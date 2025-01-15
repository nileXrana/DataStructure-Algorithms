public class assignmentQ9 {
    public static void main(String[] args) {
        nilesh ni = new nilesh();
        String str = "person"; 
        String mx = str.substring(0,1);
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String s = str.substring(i,j);
                mx = ni.max(mx,s);
            }
        }
        System.out.println(mx);
    }
}
class nilesh{
    public static String max(String a, String b){
        int n = a.compareTo(b);
        if(n > 0) return a;
        if(n < 0) return b;
        return a;
    }
}
