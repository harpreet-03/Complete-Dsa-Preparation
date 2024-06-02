import java.util.Scanner;

public class printAllDivisors {
	public static void printDivisorsOptimal(int n) {

		// System.out.println("The divisors of "+n+" are:");
		// for(int i = 1; i <= (int)Math.sqrt(n); i++)
		// if(n % i == 0){
		// System.out.print(i + " ");
		// if(i != n/i) System.out.print(n/i + " ");

		// }

		// System.out.println();

		// or

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int i = 1;
		System.out.print("The divisors of " + num + " are: ");
		while (i <= num) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		sc.close();
	}

	public static void main(String[] args) {
		printDivisorsOptimal(36);
	}
}
