package Day7Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;

//.Write a Java program to append the specified element to the end of a HashSet.
public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("Original HashSet: " + set);

        // Append an element
        String newElement = "Dragonfruit";
        set.add(newElement);

        System.out.println("HashSet after adding new element: " + set);
    }
}

