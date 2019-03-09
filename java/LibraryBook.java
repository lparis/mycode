/*
 * Java Project
 * CIS163_AA_Phillips
 * lparis Lesson 9.1 
 * LibraryBook.java
 */

package lparis_Lesson_9;

public class LibraryBook 
{
	private String title, author;
	private int pages;
	
	public LibraryBook(String ttl, int ppg, String auth) 
	{
		title = ttl;
		author = auth;
		pages = ppg;
	}

	public int getPages() 
	{
		return pages;
	}

	public void setPages(int pages) 
	{
		this.pages = pages;
	}

	public String getAuthor() 
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
}

