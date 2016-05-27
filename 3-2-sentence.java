/**
 * Do not change the method or class
 * declarations.
 */


public class Main{
    
    /* 
     * Look at what is happening with the strings
     */
    static void assignAuthor(String sentence, String author){

	    sentence = sentence + " Author: " +author;

	    System.out.println("The sentence is: "+ sentence);
    }

    
    public static void main(String[] args){
	
	    String sentence = "Veni, vidi, vici";
	    String author = "Julius Caesar";
	
	    System.out.println("The sentence is: "+ sentence);
	    System.out.println("The author is: "+ author);
	    assignAuthor(sentence, author);
	    System.out.println("The sentence is: "+ sentence);

    }

}
