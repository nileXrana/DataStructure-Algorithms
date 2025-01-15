import java.util.Scanner;
class assignmentQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        char[] ch = str.toCharArray();
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                ch[i] = '#';
            }
        }
        for(char ele : ch){
            System.out.print(ele+" ");
        }
    }
}