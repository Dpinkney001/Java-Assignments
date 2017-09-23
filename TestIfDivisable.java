package homeworkProblem1;

import java.util.Scanner;

public class TestIfDivisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		int result = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter to numbers with a space in between: ");
		
		
		x = kb.nextInt();
		y = kb.nextInt();
		result = x % y;
		if (result == 0){
			System.out.println("The number " + x + " is evenly divisable  by the number " + y + ".");
		}
		else
			System.out.println("the number " + x + " is not evenly divisable by " + y + ".");
		

	}

}
