package Day8Questions;

import java.util.HashMap;
//2.Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.
public class HashMapIsEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, String> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        }

        // Add some elements
        map.put("Name", "Alice");
        map.put("City", "New York");

        // Check again
        if (!map.isEmpty()) {
            System.out.println("The HashMap is not empty.");
        }
    }
}

