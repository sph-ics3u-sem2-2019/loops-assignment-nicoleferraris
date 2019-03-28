package problem5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read the string and output in reverse case.
		Scanner in=new Scanner(System.in);
		
		System.out.println("Type in a String.");
		String input = in.nextLine();
		int length = input.length();
		
		for (int i = 0; i < length; i++) {
			char x = input.charAt(i);
			if (Character.isUpperCase(x)) {
				x = Character.toLowerCase(x);
			} else if (Character.isLowerCase(x)) {
				x = Character.toUpperCase(x);
			}
			System.out.print(x);
		}
		}
	}
