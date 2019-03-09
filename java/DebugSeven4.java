// FixDebugSeven4.java
// converts a string to lowercase, and 
// displays the string's length
// as well as a count of letters
public class DebugSeven4
{
   public static void main(String[] args)
   {
      String aString = "HELP!! I need to get 37 things DONE today!!";
      int numLetters = 0;
      int stringLength = aString.length(); // public int length() returns number of chars in the string
      int numNumbers = 0;
      int numWhite = 0;
      
      System.out.println("The sentence is: \n" + aString);
      System.out.println("In all lowercase, the sentence is: ");
 
      for(int i = 0; i < stringLength; i++)
      {
    	 char ch = Character.toLowerCase(aString.charAt(i));
    	 // char up = Character.toUpperCase(aString.charAt(i));
         System.out.print(ch);
    	 // System.out.print(up);
         if(Character.isLetter(ch))
            numLetters++;
         if(Character.isDigit(ch))
        	 numNumbers++;
         if(Character.isWhitespace(ch))
        	 numWhite++;
      }
      System.out.println();
      System.out.println("The number of CHARACTERS in the string is " + stringLength);
      System.out.println("The number of LETTERS is " + numLetters);
      System.out.println("The number of NUMBERS is " + numNumbers);
      System.out.println("The number of WHITESPACES is " + numWhite);
   }
}