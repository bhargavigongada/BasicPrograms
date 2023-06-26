import java.util.Scanner;

public class Positive_or_Negative {
	int a;
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = p.nextInt();
		if (a>=0) {
			System.out.println("The Given Number is  Positive Number");
		}
		else {
			System.out.println("The Given Number is Negative Number");
		}
	}
	
}
