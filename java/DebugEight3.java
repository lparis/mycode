// FixDebugEight3.java
// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      String entry;
      char[] floorPlan = {'A','B','C','a','b','d'};
      int[] priceInThousands = {145, 190, 235};
      char plan;
      int x, fp = 99;
      String prompt = "Please select a floor plan\n" +
          "Our floorplans are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floorplan letter";
      entry = JOptionPane.showInputDialog(null, prompt);
      plan = entry.charAt(0);
      for(x = 0; x < floorPlan.length; ++x)
	 if(plan == floorPlan[x])
           fp = x;
      if(fp == 99)
        JOptionPane.showMessageDialog(null,
            "Invalid floor plan code entered");
      else
      {
        if(fp > floorPlan.length - 1)
           fp = fp - floorPlan.length;
        JOptionPane.showMessageDialog(null, "Model " +
           plan + " is priced at only $" +
           priceInThousands[fp] + ",000");
      }
   }
}

