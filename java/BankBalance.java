import java.util.Scanner;
public class BankBalance
{
   public static void main(String[] args)
   {
      double balance;
      String response;
      char responseChar;
      int tempBalance;
      int year = 1;
      final double INT_RATE = 0.03;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter initial bank balance > ");
      balance = keyboard.nextDouble();
      keyboard.nextLine();
      System.out.println("Do you want to see next year's balance?");
      System.out.print("Enter y or n > ");
      response = keyboard.nextLine();
      responseChar = response.charAt(0);
      while(responseChar == 'y')
      {
         balance = balance + balance * INT_RATE;
         tempBalance = (int)(balance * 100);
         balance = tempBalance / 100.0;
         System.out.println("After year " + year + " at " +  INT_RATE +
             " interest rate, balance is $" + balance);
         year = year + 1;
         System.out.print("Do you want to see the balance " +
            "\nat the end of another year? y or n? >");
         response = keyboard.nextLine();
         responseChar = response.charAt(0);
      }
   }
}
