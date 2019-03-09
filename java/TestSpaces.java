
public class TestSpaces {

	public static void main(String[] args) {
		
		String s = "How may spaces";
		
		int spaces = s.length() - s.replaceAll(" ", "").length();
		
		System.out.println(s.length());


	}

}
