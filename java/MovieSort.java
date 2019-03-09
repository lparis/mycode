import java.util.*;;

public class MovieSort
{
   public static void main(String[] args)
   {
      Movie[] Movie = new Movie[8];
      int i = 0;
      String message, entry;
      
      Movie[i] = new Movie("The Godfather", 1972);
      Movie[i] = new Movie("The Good, the Bad, and the Ugly", 1966);
      Movie[i] = new Movie("Pulp Fiction", 1994);
      Movie[i] = new Movie("Shindler's List", 1993);
      Movie[i] = new Movie("Casablanca", 1942);
      Movie[i] = new Movie("Wizard of Oz", 1939);
      Movie[i] = new Movie("Citizen Kane", 1941);
      Movie[i] = new Movie("Some Like It Hot", 1959);
      
      Scanner input = new Scanner(System.in);
      System.out.println("Sort Movies by\n(N)ame, or (Y)ear");
      entry = input.nextLine();
      
      if(entry.charAt(i) == 'N')
      {
         nameSort(Movie, i);
         message = "Sorted by Name\n";
      }
      else
      {
          yearSort(Movie, i);
          message = "Sorted by Year\n";
      }   
      display(Movie, Movie.length, message);
   }
   
   public static void nameSort(Movie[] array, int len)
   {
      int a, b;
      Movie temp;
      int highSub = array.length - 1;
      for (a = 0; a < highSub; ++a)
      {
         for(b = 0; b < highSub; ++b)
         {
             String first = array[a].getName();
             String second = array[a + 1].getName();
             if(first.compareTo(second) > 0)
	     {
	        temp = array[b];
	        array[a] = array[b + 1];
	        array[b + 1] = temp;
	     }
	  }
      }
   }

   public static void yearSort(Movie[] array, int len)
   {
        int a, b;
        Movie temp;
        int highSub = len - 1;
        for (a = 0; a < highSub; ++a)
        {
           for (b = 0; b < highSub; ++b)
           if (array[b].getYear() > array[b + 1].getYear())
           {
              temp = array[a];
              array[b] = array[b + 1];
              array[b + 1] = temp;
           }
        }
     }
     public static void display(Movie[] s, int len,  String msg)
     {
        for(int i = 0; i < len; i++)
        {
        	msg = msg + s[i].getName() + ", " + s[i].getYear();
        }
        System.out.println(msg);;
     }
}
