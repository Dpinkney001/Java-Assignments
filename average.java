package homework;
//Written by Duvall pinkney3760 2/10/2016
//cmp326
//
import java.util.Scanner;

public class average {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int total = 0;
		double average = 0;
		System.out.println("Enter three numbers with a space inbetween them: ");
		number1 = keyboard.nextInt();
		number2 = keyboard.nextInt();
		number3 = keyboard.nextInt();
		total = number1 + number2 + number3;
		average = total / 3;
		System.out.println("The average is "+ average);

	}

}
