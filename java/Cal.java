
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String DATE_FORMAT = "yyyyMMdd";
		    SimpleDateFormat sdf =
		          new SimpleDateFormat(DATE_FORMAT);
		    Calendar c1 = Calendar.getInstance(); // today
		    System.out.println("Today is " + sdf.format(c1.getTime()));
		  }
		}



