package Day9Questions;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
//2.Navigate over the elements of the treemap.(All methods)
public class TreeMapTraversal {
    public static void main(String[] args) {
        // Initialize TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("TreeMap: " + treeMap);

        // 1. Using for-each loop on entrySet()
        System.out.println("\nUsing for-each loop on entrySet():");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 2. Using Iterator on entrySet()
        System.out.println("\nUsing Iterator on entrySet():");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 3. Using keySet()
        System.out.println("\nUsing keySet():");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " = " + treeMap.get(key));
        }

        // 4. Using values()
        System.out.println("\nUsing values():");
        for (Integer value : treeMap.values()) {
            System.out.println("Value: " + value);
        }

        // 5. Using Streams
        System.out.println("\nUsing Streams:");
        treeMap.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }
}

