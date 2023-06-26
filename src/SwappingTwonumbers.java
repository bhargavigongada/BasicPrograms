import java.util.Scanner;

public class SwappingTwonumbers {
	int a,b;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Before Swapping :"+ "a = "+a+" b = "+ b ) ;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping :" + "a = "+a+" b = "+ b );
	}
}
