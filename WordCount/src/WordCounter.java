/*
 * Assumptions: User inputs a valid text input and that the program should print unique words
 * and then all words with their counts in the provided input
 * 
 * Complexity: Linear/O(n). split method is O(n), the for loops iterate over n words in input
 * so O(n), HashMap operations are O(1) generally except in worst case scenarios, so total time 
 * complexity comes out to linear time ie O(n).
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    // To print all unique words in the string
    static void printUniqueWords(String str) {
        // hashmap
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
 
        // isolate words with regex
        String[] words = str.split("\\W");
 
        // Iterative for loop to loop through words in input
        for (String word : words) {
            // If the word is present, increment value by 1
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
 
            // Else store the word inside map with value 1
            else
                map.put(word, 1);
        }
 
        // Iterate over the map using iterative for loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
        	// print unique words
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
        // words with counts (I assumed all word counts are wanted here)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
 
    //main
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter text input");
    	String input = scanner.nextLine();
        printUniqueWords(input);
        scanner.close();
    }
}

