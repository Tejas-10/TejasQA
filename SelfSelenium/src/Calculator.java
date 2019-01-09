import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = scan.nextInt();
		for (int i=a;i==1;i--){
			System.out.println("*");
		}

	}

}
