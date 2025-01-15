public class compression {
    public static void main(String[] args) {
        String str = "aaaabbbccd";   //a4b3c2d
        int n = str.length();
        // 2 pointer approach
        int i = 0; 
        int j = 0;
        while(j < n){
            if(str.charAt(j) == str.charAt(i)) j++;
            else{
                System.out.print(str.charAt(i));
                if(j - i != 1) System.out.print(j-i);
                i = j;
            }
        }
        System.out.print(str.charAt(i));
        if(j - i != 1) System.out.println(j-i);
        
    }
}
