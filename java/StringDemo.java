
public class StringDemo 
{
	public static void main(String[] args) {
		
        String phrase = "The world wide web is a fun place!";
        
     	// To find the first 'w'...
        int first = phrase.indexOf('w');
        System.out.println("The first 'w' is at position: " + first);
        
     	// If you need to find the second 'w' in the phrase...
     	// You can tell Java the position of where to start 
     	// looking within in the String!
     
        int second = phrase.indexOf('w', ++first);	// Start looking after the first 'w'.
        System.out.println("The second 'w' is at position: " + second);
        
        int third = phrase.indexOf('w', ++second);	// Start looking after the first 'w'.
        System.out.println("The third 'w' is at position: " + third);


	}

}
