import java.util.*;

public class SomeMovies 
{
	public static void main(String[] args) 
	{
		Movie[] someMovies = new Movie[3];
		int i = 0;
		someMovies[0] = new Movie("The Godfather", 1972);
		someMovies[1] = new Movie("The Good, the Bad, and the Ugly", 1966);
		someMovies[2] = new Movie("Pulp Fiction", 1994);
		
		System.out.println(someMovies[0].getName() + " " + someMovies[0].getYear());
		System.out.println(someMovies[1].getName() + " " + someMovies[1].getYear());
		System.out.println(someMovies[2].getName() + " " + someMovies[2].getYear());
	}
}