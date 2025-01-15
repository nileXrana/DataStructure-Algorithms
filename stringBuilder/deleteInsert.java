class deleteInsert{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.insert(1,'z');   // insert anything
        System.out.println(sb);
    }
}