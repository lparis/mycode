
public class StringBuilderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
	}
}
/**
	length() - the length of the character sequence in the builder since this stringbuilder doesn't contain any content, its length will be 0.

	capacity() - the number of character spaces that have been allocated. When you try to construct a stringbuilder with empty content, 
	by default it takes the initialize size as length+16 which is 0+16. so capacity would return 16 here.

	Note: The capacity, which is returned by the capacity() method, is always greater than or equal to the length (usually greater than) and 
	will automatically expand as necessary to accommodate additions to the string builder.

	The logic behind the capacity function:

	    If you don't initialize stringbuilder with any content, default capacity will be taken as 16 characters capacity.
	    If you initialize stringbuilder with any content, then capacity will be content length+16.
	    When you add new content to stringbuilder object, if current capacity is not sufficient to take new value, then it will grow by (previous array capacity+1)*2.


	}

}
**/