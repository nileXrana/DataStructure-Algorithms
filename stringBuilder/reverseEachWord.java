import java.util.Scanner;
class nilesh{
    void reverse(StringBuilder sb,int i,int j){
        while(i < j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
public class reverseEachWord {
    public static void main(String[] args) {
        nilesh ni = new nilesh();
        StringBuilder sb = new StringBuilder("physics wallah channel");
        int n = sb.length();
        // 2 pointer approach : 
        int i = 0;
        int j = 0;
        while(j <= n){
            if(j == n){
                ni.reverse(sb,i,j-1);
                break;
            }
            else if(sb.charAt(j) != ' '){
                j++;
            }
            else{
                ni.reverse(sb,i,j-1);
                j++;
                i = j;
            }
        }
        System.out.println(sb);
    }

}
