import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Hiển thị các entry trong HashMap.");
        System.out.println(hashMap+"\n");

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("Hiển thị các entry trong LinkedHashMap.");
        System.out.println(linkedHashMap);
        System.out.println("Tổi của Lewis là " + linkedHashMap.get("Lewis")+".");
        System.out.println(linkedHashMap.values());

        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        System.out.println("Hiển thị các entry trong TreeMap.");
        System.out.println(treeMap);

    }
}
