// Decides if a number is even or odd
import java.util.Scanner;
public class DebugFive2
{
   @SuppressWarnings("resource")
public static void main(String args[])
   {
      int num;
      String userInput;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      userInput = input.next();
      num = Integer.parseInt(userInput);
      if(num % 2 == 0) // If number / 2 has 0 rem, then it's even
         System.out.println("Number is even.");
      else // Otherwise odd
         System.out.println("Number is odd.");
   }
}