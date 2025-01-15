public class throwError {
    public static void isfive(int val) throws Exception{
        if(val != 5) throw new Exception("Error : value not five");
        System.out.println("Value is five");
    }
    public static void main(String[] args) throws Exception{
        int a = 1;
        isfive(a);
    }
}
