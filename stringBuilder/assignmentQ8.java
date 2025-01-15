public class assignmentQ8 {
    public static void main(String[] args) {
        nilesh ni = new nilesh();
        String str = "abcdee";
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String ttr = str.substring(i,j);
                System.out.println(ttr);
                boolean bool = ni.vow(ttr);
                if(bool == true) sum++;
                // for(int k = 0; k < ttr.length(); k++){
                //     if(ttr.charAt(k) != 'a' && ttr.charAt(k) != 'e' && ttr.charAt(k) != 'i' && ttr.charAt(k) != 'o' && ttr.charAt(k) != 'u'){
                //         bool = false;

                //     }
                // }
                
                
            }
        }
        System.out.println(sum);
    }
}
class nilesh{
    public static boolean vow(String str){
        boolean bool = false;
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) ==  'o' || str.charAt(i) == 'u'){
                sum = 1;
            }
            else return false;
        }
        return true;
    }
}
