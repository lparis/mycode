import javax.swing.JOptionPane;
public class StringBuilderDemo
{
   public static void main(String[] args)
   {
      StringBuilder nameString = new StringBuilder("Barbara");
      int nameStringCapacity = nameString.capacity(); 		// string length + 16 = 23
      
      System.out.println("Capacity of nameString is " + nameStringCapacity);
      StringBuilder addressString = null;
      
      addressString = new StringBuilder("6311 Hickory Nut Grove Road"); 		// 16 + 27 = 43
      int addStringCapacity = addressString.capacity();
      System.out.println("Capacity of addressString is " + addStringCapacity);
      nameString.setLength(20);
      System.out.println("The name is " + nameString + "end");
      addressString.setLength(20);
      System.out.println("The address is " + addressString);
   }
}
