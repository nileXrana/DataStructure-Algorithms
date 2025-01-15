public class towerOfHanoi{
    public static void tower(int n, char a, char b, char c){
        // if(n <= 0) System.out.println("illegal entry");
        if(n == 1) System.out.println("move disk from "+a+" to "+c);
        else{
            tower(n-1,a,c,b);
            tower(1,a,b,c);
            tower(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        int n = 3; // given no of disks : 
        tower(n,'a','b','c');
    }
}