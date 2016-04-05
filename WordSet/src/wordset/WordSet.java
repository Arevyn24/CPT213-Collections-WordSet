
package wordset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {

  public static void main(String[] args) {
    System.out.println("WORD SET \n");
    
    // accept a sentence from the user
    System.out.println("Enter a sentence to split: ");
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.nextLine();
    
    // create a tree set and initialize with user input after tokenization
    TreeSet<String> wordSet = tokenize(input);
    
    System.out.println("\nHere are the unique words you entered (Ascending Order):");
    
    // create an instance of the iterator class and link to the word set
    Iterator<String> iterator = wordSet.iterator();
    
    // while iterator has more strings, print each unique word on a new line
    while (iterator.hasNext()) {
      String word = iterator.next();
      System.out.println(word);
    }
    
    System.out.println("\nEND OF PROGRAM");
  }
  
  
  public static TreeSet tokenize(String input) {
    // split string by spaces and fill array
    String[] tokenized = input.split("\\s");
    
    // declare and initialiize empty hash set
    TreeSet<String> tokensSet = new TreeSet<>();
    
    // for each string (word) in array, add element to Tree Set
    for(String token : tokenized){
      tokensSet.add(token);
    }
    
    return tokensSet;
  }
}
