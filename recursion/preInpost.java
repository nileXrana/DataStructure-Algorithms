public class preInpost {
    public static void pip(int p){
        if(p == 0) return;
        System.out.print(p+" ");
        pip(p-1);
        System.out.print(p+" ");
        pip(p-1);
        System.out.print(p+" ");
    }
    public static void main(String[] args) {
        pip(3);
    }
}
