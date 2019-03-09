
import java.util.Arrays;

public class PrintArray 
{
	public static void main(String[] args) {
		
		String[][] classDayTime = new String[6][2]; 
		classDayTime[0][0] = "CIS110";
		classDayTime[0][1] = "Thurs 3:30 pm";
		classDayTime[1][0] = "ENG210";
		classDayTime[1][1] = "Mon 8:30 am";
		classDayTime[2][0] = "GEO225";
		classDayTime[2][1] = "Tues 1:10 pm";
		classDayTime[3][0] = "CHM360";
		classDayTime[3][1] = "Wed 10:00 am";
		classDayTime[4][0] = "BIO100";
		classDayTime[4][1] = "Fri 5:00 pm";
		classDayTime[5][0] = "MTH501";
		classDayTime[5][1] = "Tues 9:15 am";
		
		System.out.println(Arrays.deepToString(classDayTime));
		
	}
}
