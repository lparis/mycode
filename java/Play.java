import java.util.*;
public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		int b = 1;
		while(b < 4)
		{
			System.out.println(b);
			b = b + 1;
		}
		System.out.print("End loop.");
		**/
		int total = 100;
		int amt = 200;
		int h;
		int n;
		int m = 9;
		int g = 5;
		int e = 1;
		int j = 5;
		int k = 6;
		while(e < 3)
		{
			System.out.print(e + " ");
			total += amt;
			System.out.print(total + " ");
			System.out.println(amt);
			h = ++g;
			System.out.print(h + " ");
			n = m++;
			System.out.print(n + " ");
			System.out.print(j++ + " ");
			e = e + 1;
		}		
	}
}
