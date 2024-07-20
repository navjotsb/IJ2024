package July16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Mark", 25); // entry
        map.put("Peter", 34);
        map.put("Parker", 55);
        map.put("John", 47);
        map.put("Mike", 36);
        map.put("Mike", 34); // This will overwrite the previous entry with key "Mike"

        System.out.println(map);
        System.out.println(map.get("Mike"));
        System.out.println(map.getOrDefault("Divyesh", 25));

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Set<String> set = map.keySet();
        System.out.println("Set of keys in the map: " + set);

        Collection<Integer> values = map.values();
        System.out.println("Set of values in the map: " + values);

    }
}
