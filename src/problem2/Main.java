package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		System.out.println("Insert first input.");
		input1 = in.nextInt();
		System.out.println("Insert second input.");
		input2 = in.nextInt();
		System.out.println("Input = "+input1+","+input2);
		int result = 0;	
		
		
		for (int add = input1; add <= input2; add++) {
			result = result + add;
		}
		
		System.out.println("Output = "+result);
	}

}
