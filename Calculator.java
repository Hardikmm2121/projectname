import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter number a:");
		int a = sc.nextInt();
		System.out.println("Please enter number b:");
		int b = sc.nextInt();
		System.out.println("Please select operation \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Modulo");
		int operation = sc.nextInt();

		switch (operation) {

		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			System.out.println(a % b);
			break;
		default:
			System.out.println("Please enter valid operation.");

		}

	}
}
