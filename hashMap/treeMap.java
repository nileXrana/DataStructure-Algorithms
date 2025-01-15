import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("nilesh",10);
        map.put("arvind",20);
        map.put("rohit",30);
        map.put("aditya",40);
        // for keys(important)
        for(String key : map.keySet()){ // sort on the basis of key(ascii values)
            System.out.println(key+" "+map.get(key));
        }
    }
}
