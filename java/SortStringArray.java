
import java.util.*;

public class SortStringArray 
{
	public static void main(String[] args) throws Exception 
	{
		String[] strArray = { "Carol", "bob", "Alice" };
		displayArray(strArray);

		Arrays.sort(strArray);
		displayArray(strArray);

		Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
		displayArray(strArray);

		System.out.println("---------------");

		List<String> strList = new ArrayList<String>();
		strList.add("larry");
		strList.add("Moe");
		strList.add("Curly");
		displayList(strList);

		Collections.sort(strList);
		displayList(strList);

		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		displayList(strList);
	}

	public static void displayArray(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public static void displayList(List<String> list) {
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}