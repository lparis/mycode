// This application displays some math facts
public class DebugThree2
{
   public static void main(String args[])
   {
      int a = 2, b = 5, c = 10; // Defines 3 integers
      add(a, b); // Calls add() method
      add(b, c); // Calls add() method
      subtract(c, a); // Calls subtract() method          
   }
   public static void add(int a, int  b)
   {
      System.out.println("The sum of " + a +
         " and " + b + " is " + a + b);
   }
   public static void subtract(int a, int b)
   {
      System.out.println("The difference between " +
        a + " and " + b + " is " +  (a - b));
   }
}
