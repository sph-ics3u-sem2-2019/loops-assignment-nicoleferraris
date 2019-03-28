package problem6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a name, and print out the box
		/*
		 * Example input: Zebarth
		 * Output:
		 * Zebarth
		 * ebarthZ
		 * barthZe
		 * arthZeb
		 * rthZeba
		 * thZebar
		 * hZebart
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Print a string.");
		String input = in.nextLine();
		System.out.println("Input: "+input);
		int length = input.length()-1;
		
		for (int i = 0; i <= length; i++) {
			String x = input.substring(0,i);
			System.out.println(input.substring(i)+x);
		}
	}
}
