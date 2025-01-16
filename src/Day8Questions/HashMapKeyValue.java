package Day8Questions;

import java.util.HashMap;
//1.Write a Java program to associate the specified value with the specified key in a HashMap.
public class HashMapKeyValue {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Associate key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        System.out.println("HashMap: " + map);

        // Add a specified key-value pair
        map.put(4, "Diana");
        System.out.println("Updated HashMap: " + map);
    }
}

