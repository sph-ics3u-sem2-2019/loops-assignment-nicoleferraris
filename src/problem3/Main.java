package problem3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a word and print out one character per String
		Scanner in=new Scanner(System.in);
		String word = "";
		System.out.println("Type a word.");
		word = in.nextLine();
		
		int length = word.length();
		int position = 0;
		String letter = word.substring(0,position);
		
		while (position < length) {
			System.out.println(letter);
			position = position + 1;
		}
				
		}
	}

