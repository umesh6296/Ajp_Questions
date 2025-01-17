package Day9Questions;
import java.util.TreeMap;
//1. Returns and removes the entry associated with the specified key from a TreeMap
//Eg:TreeMap: {One=1, Three=3, Two=2}
//Removed value = 2
//Is the entry {Three=3} removed? True
//Updated TreeMap: {One=1}
public class TreeMapExample {
    public static void main(String[] args) {
        // Initialize TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Three", 3);
        treeMap.put("Two", 2);

        System.out.println("Initial TreeMap: " + treeMap);

        // Remove entry with key "Two"
        Integer removedValue = treeMap.remove("Two");
        System.out.println("Removed value = " + removedValue);

        // Check if entry {Three=3} exists
        boolean isEntryRemoved = !treeMap.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + isEntryRemoved);

        // Display updated TreeMap
        System.out.println("Updated TreeMap: " + treeMap);
    }
}

