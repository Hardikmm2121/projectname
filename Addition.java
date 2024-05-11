import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		System.out.println("Addition of 3 and 7 is " + (3 + 7));
		//modify for branch
		

		

		//This is for sum the number's digit
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of the number");
		int size = sc.nextInt();
		System.out.println("Please enter number");
		int a = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < size; i++) {

			sum = (a % 10) + sum;
			a = a / 10;

		}
		System.out.println(sum);
	}

}
