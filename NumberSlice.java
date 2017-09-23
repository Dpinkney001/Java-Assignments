package homework;

import java.util.Scanner;

//Program writing by Duvall Pinkney 2/10/2016
//cmp326
//
public class NumberSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String number = "";
		System.out.println("Please enter a 4 digit number: ");
		number = keyboard.next();
		System.out.println(number.substring(0,1));
		System.out.println(number.substring(1,2));
		System.out.println(number.substring(2,3));
		System.out.println(number.substring(3,4));
		

	}

}
