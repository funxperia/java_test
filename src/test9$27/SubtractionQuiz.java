package test9$27;

import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		if (number1 < number2) {
			int tmp = number1;
			number1 = number2;
			number2 = tmp;
		}
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if (number1 - number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong!");
			System.out.println("The correct answer is:" + (number1 - number2) + ".");
		}
	}
}
