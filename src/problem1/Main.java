package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		int input = 0;
		System.out.print("Insert input.");
		input = in.nextInt();
		
		int output = 0;
		System.out.println("Output =");
		while (output < input) {
			output = output+1;
			System.out.println(output);
		}
		
	}

}
