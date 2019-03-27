package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);			
		int score = 10;

		for (int x=0;x<10;x++) {
			int question = x;
			int num1 = rnd.nextInt(10-1+1)+1;
			int num2 = rnd.nextInt(10-1+1)+1;
			int reply = 0;
			int answer = 0;		


				if (question == 1) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
					if (reply == answer ) {
						System.out.println("Correct!");
					} else {
						System.out.println("Incorrect!");
						score--;
					}
			} else if (question == 2) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
					if (reply == answer) {
						System.out.println("Correct!");
					} else {
						System.out.println("Incorrect!");
						score--;
					}
			} else if (question == 3) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
					if (reply == answer) {
						System.out.println("Correct!");
					} else {
						System.out.println("Incorrect!");
						score--;
					}
			} else if (question == 4) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
					if (reply == answer) {
						System.out.println("Correct!");
					} else {
						System.out.println("Incorrect!");
						score--;
					}
			} else if (question == 5) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
					if (reply == answer) {
						System.out.println("Correct!");
					} else {
						System.out.println("Incorrect!");	
						score--;
					}
			} else if (question == 6) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
				if (reply == answer) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					score--;
				}
			} else if (question == 7) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
				if (reply == answer) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					score--;
				}
			} else if (question == 8) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
				if (reply == answer) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					score--;
				}
			} else if (question == 9) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
				if (reply == answer) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					score--;
				}
			} else if (question == 10) {
				System.out.println(num1+" x "+num2);
				answer = num1 * num2;
				reply = in.nextInt();
				if (reply == answer) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					score--;
				}
			}
		
		}
		
		int finalscore = score*10;
		System.out.println("Your final mark is: "+finalscore+"%");
			
		if (finalscore >= 50) {
				System.out.println("Passed!");
			} else {
				System.out.println("Failed!");
			}
		
	}

}
