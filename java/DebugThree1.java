public class DebugThree1
// this class calculates a waitperson's tip as 15% of the bill
{
   public static void main(String args[])
   {
      double myCheck = 50.0;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck); // Calls calcTip() with value of myCheck (50)
      calcTip(yourCheck);
   }
    public static void calcTip(double bill)
    // Method calcTip() takes a double as input
    {
      final double RATE = 0.15;
      double tip;
      tip = (bill * RATE);
      System.out.println("The tip should be at least " + tip);
    }
}
