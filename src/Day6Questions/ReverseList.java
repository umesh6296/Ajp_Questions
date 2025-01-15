package Day6Questions;
import java.util.ArrayList;
import java.util.Collections;

//2.Write a program to reverse a given List of strings.
public class ReverseList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        // Reverse the list
        Collections.reverse(stringList);

        // Display the reversed list
        System.out.println("Reversed List:");
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}

