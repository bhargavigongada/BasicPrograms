import java.util.Scanner;

public class Divisible_or_not {
	int a,b;
	
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a = d.nextInt();
		int b = d.nextInt();
		if (a%b==0) {
			System.out.println("The Given Number is Divisible");
		}
		else {
			System.out.println("The Given Number is Not Divisible");
		}
	}
	
}
