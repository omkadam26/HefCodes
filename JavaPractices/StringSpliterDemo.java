import java.util.Scanner;


public class StringSpliterDemo
{   
    public static void main(String[] args) {
    String input = "Hello World! Java Programming";
        // Split the input string into an array of words
        String[] words = s.split(" ");
        
        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        // Remove trailing whitespace and return the reversed string
        reversed.toString().trim();
    }

}