package Day8Questions;
import java.util.HashMap;
import java.util.Scanner;
//3.write a program in Java to create a Map Interface where we can store the cricketer name
// in it along with his scores and search for the batsman name and display his score.
public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and scores
        HashMap<String, Integer> cricketers = new HashMap<>();

        // Add some cricketer names and scores
        cricketers.put("Virat Kohli", 12000);
        cricketers.put("Rohit Sharma", 10000);
        cricketers.put("Steve Smith", 9500);
        cricketers.put("Joe Root", 11000);

        // Take user input for searching a cricketer's score
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cricketer's name to search for their score: ");
        String name = scanner.nextLine();

        // Search for the cricketer's score
        if (cricketers.containsKey(name)) {
            System.out.println(name + "'s score: " + cricketers.get(name));
        } else {
            System.out.println("Cricketer not found in the records.");
        }

        scanner.close();
    }
}

