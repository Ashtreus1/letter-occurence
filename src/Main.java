import java.util.Scanner;

public class Main {
	
	static Scanner input = new Scanner(System.in);
	static final int MAX_CHAR = 256;
	 
    static void getOccurence(String word)
    {
         
        // Creating an array of size 256 
        // i.e. ASCII_SIZE
    	// We use the ASCII_SIZE to accept everytime kind of characters and symbols in a word
        int count[] = new int[MAX_CHAR];
       
        int len = word.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[word.charAt(i)]++;
 
        // Create an array of given word size
        char ch[] = new char[len];
        
        for (int i = 0; i < len; i++) {
        	
            ch[i] = word.charAt(i); // Initializing each character in the word
            int find = 0;
            
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (word.charAt(i) == ch[j])
                    find++;
            }
            
            // Everytime the occurence, it will print out the number of letter occurence
            if (find == 1)
                System.out.println(
                    ch[i]
                    + ":" + count[ch[i]]);
        }
    }
   
    public static void main(String[] args)
    {
    	// Main Program
    	System.out.print("Enter any word: ");
    	String word = input.nextLine();
    	
    	System.out.println(word);
    	
    	String insensitiveWord = word.toLowerCase().replaceAll("\\s", "");
    	
    	System.out.println("Letter counts:");
    	getOccurence(insensitiveWord);
    }
}
