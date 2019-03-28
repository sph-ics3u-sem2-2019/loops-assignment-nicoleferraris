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
		int length = input.length();
		
		for (int i = 1; i <= length; i++) {
				System.out.println(input);

		}
		
		
		


	}

}
