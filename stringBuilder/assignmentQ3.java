public class assignmentQ3 {
    public static void main(String[] args) {
        String str = "1000101";
        int n = str.length();
        int i = 0;
        int j = n - 1;
        boolean bool = false;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                bool = true;
                break;
            }
        }
        if(bool == true) System.out.println("not a pallindrome");
        else System.out.println("pallindrome");
        

    }
}
