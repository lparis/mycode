/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 8.1 
 * IntArry.java
 */

public class IntArray 
{
	public static void main(String[] args) 
	{
		final int ARRAY_ELEMENTS = 5;
		int someInt[] = {0, 1, 2, 3, 4};
		// final int ARRAY_ELEMENTS = 6;
		// int someInt[] = {-128, 127, -32768, 32767, -2147483648, 2147483647};
		// String type[] = {"byte min = ", "byte max = ", "short min = ", "short max = ", "int min = ", "int max = "};
		// int byteSize[] = {1, 2, 4, 8};
		
		int x;
		
		String firstToLast = "The integers in this " + ARRAY_ELEMENTS + " element array are, from first to last: ";
		String lastToFirst = "The integers in this " + ARRAY_ELEMENTS + " element array are, from last to first: ";
		
		System.out.print(firstToLast);
		for (x = 0; x < ARRAY_ELEMENTS; x++)
		{
			// System.out.print(type[x] + " ");
			System.out.print(someInt[x] + " ");
		}
		
		System.out.println();
		System.out.print(lastToFirst);
		for (x = ARRAY_ELEMENTS - 1; x >= 0; x--)
		{
			// System.out.print(type[x] + " ");
			System.out.print(someInt[x] + " ");
		}
	}
}
