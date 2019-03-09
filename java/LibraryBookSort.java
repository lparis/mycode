/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 9.1 
 * LibraryBookSort.java
 */

package lparis_Lesson_9;

import javax.swing.*;
import java.util.*;

public class LibraryBookSort
{
	public static void main(String[] args)
	{
		LibraryBook[] Book = new LibraryBook[10];
		int i = 0;
		String message = null, entry;
		Book[0] = new LibraryBook("Summer of the Monkeys", 288, "Rawls");
		Book[1] = new LibraryBook("Gravity's Rainbow", 784, "Pynchon");
		Book[2] = new LibraryBook("Painted Bird", 234, "Kozinsky");
		Book[3] = new LibraryBook("Moby Dick", 704, "Melville");
		Book[4] = new LibraryBook("Philosophical Programmer", 228, "Kernighan");
		Book[5] = new LibraryBook("Anna Karenina", 838, "Tolsoty");
		Book[6] = new LibraryBook("Tristram Shandy", 452, "Sterne");
		Book[7] = new LibraryBook("Alphabetical Africa", 152, "Abish");
		Book[8] = new LibraryBook("The Divine Comedy", 346, "Dante");
		Book[9] = new LibraryBook("Shakespears of London", 397, "Chute");
		
		entry = JOptionPane.showInputDialog(null, "Sort Books by\n(T)itle, (A)uthor, or (P)age count");
		
		if(entry.charAt(i) == 'T')
		{
			titleSort(Book, i);
			message = "- Sorted by TITLE - \n";
		}
		
		if(entry.charAt(i) == 'P')
		{
			pagesSort(Book, i);
			message = "- Sorted by PAGE COUNT - \n";
		}
		if(entry.charAt(i) == 'A')
		{
			authorSort(Book, i);
			message = "- Sorted by AUTHOR - \n";
		}
		display(Book, Book.length - 1, message);
	}
	
	public static void titleSort(LibraryBook[] array, int len)
	{
		int a, b;
		LibraryBook temp;
		
		for (a = 0; a < array.length - 1; a++)
		{
			for(b = a + 1; b < array.length; b++)
			{
				if(array[a].getTitle().compareToIgnoreCase(array[b].getTitle()) > 0)
				{
					temp = array[a];
					array[a] = array[b];
					array[b] = temp;
				}
			}
		}
	}
	
	public static void authorSort(LibraryBook[] array, int len)
	{
		int a, b;
		LibraryBook temp;
		
		for (a = 0; a < array.length - 1; a++)
		{
			for(b = a + 1; b < array.length; b++)
			{
				if(array[a].getAuthor().compareToIgnoreCase(array[b].getAuthor()) > 0)
				{
					temp = array[a];
					array[a] = array[b];
					array[b] = temp;
				}
			}
		}
	}
	
	public static void pagesSort(LibraryBook[] array, int len)
	{
		int a, b;
		LibraryBook temp;
		int highSub = array.length - 1;
		
		for (a = 0; a < highSub; ++a)
		{
			for (b = 0; b < highSub; ++b)
			{
				if (array[b].getPages() > array[b + 1].getPages())
				{
					temp = array[b];
					array[b] = array[b + 1];
					array[b + 1] = temp;
				}
			}
		}
	}
	
	public static void display(LibraryBook[] s, int len,  String msg)
	{
		for(int i = 0; i <= len; i++)
		{
			msg = msg + s[i].getTitle() + ", " + s[i].getAuthor() + ", " + s[i].getPages() + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}