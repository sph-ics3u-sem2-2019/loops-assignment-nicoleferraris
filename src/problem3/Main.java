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
		int end = 1;
		int beg = 0;
		
		while (end <= length && beg <= length) {
			String letter = word.substring(beg,end);
			System.out.println(letter);
			beg++;
			end++;
		}
				
		}
	}