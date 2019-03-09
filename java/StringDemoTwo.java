public class StringDemoTwo
{
	public static void main(String[] args)
	{
        String phrase = "jan michael vincent 1234 hooper lane";
        
     	// To find the first space
        int first = phrase.indexOf(' ');
        System.out.println("The first spce is at position: " + first);
     
        int second = phrase.indexOf(' ', ++first);
        System.out.println("The second space is at position: " + second);
        
        int third = phrase.indexOf(' ', ++second);
        System.out.println("The third space is at position: " + third);
        
        int fourth = phrase.indexOf(' ', ++third);	// Start looking after the first 'w'.
        System.out.println("The fourth space is at position: " + fourth);
        
        char firstInitial = phrase.charAt(0);
        firstInitial = Character.toUpperCase(firstInitial);
        
        char secondInitial = phrase.charAt(first);
        secondInitial = Character.toUpperCase(secondInitial);
        
        char thirdInitial = phrase.charAt(second);
        thirdInitial = Character.toUpperCase(thirdInitial);
        
        System.out.print(firstInitial);
        System.out.print(secondInitial);
        System.out.println(thirdInitial);
	}

}
