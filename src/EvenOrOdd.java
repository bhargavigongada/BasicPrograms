import java.util.Scanner;

public class EvenOrOdd {
	int a;
	public static void main(String[]args) {
	
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = s.nextInt();
		if(a % 2==0) {
			System.out.println("The Given number is even number");
		}
		else {
		System.out.println("The Given number is odd number");
	}
}
}
