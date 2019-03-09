// Demonstrating the char data type


   public class DemoChar
   {
      public static void main(String[] args)
      {
      	// The "char" data type can store only one alphanumeric character at a time, 
      	// such as in this example.  
      	
         char first = 'B';		// Three char variables, each storing one letter each.
         char middle = 'M';
         char last = 'W';
      
         System.out.println("The expensive car's initials are: " + first + middle + last);
         
      	
      	// Another example: Did you know that the char data type can be assigned a character
      	// by using its assigned numeric value?  This comes in handy when creating "secret" codes...  ;-)
      	// See pages 62 through 64 in the textbook for more info. 
      	
         char c1 = 83;
         char c2 = 101;
         char c3 = 99;
         char c4 = 114;
         char c5 = 101;
         char c6 = 116;
         char c7 = 115;
      	
      	// Let's see what the secret word is...
      	
         System.out.println("The top secret word is: " + c1 + c2 + c3 + c4 + c5 + c6 + c7);
      	
      	
      }
   }
