package Calculator.program;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		double N1, N2;
		
		System.out.println("Enter First No");
		N1=S.nextDouble();
		System.out.println("Enter Second No");
		N2=S.nextDouble();
		
		System.out.println("Addition "+ (N1+N2));
		System.out.println("Substraction "+ (N1-N2));
		System.out.println("Multiplication "+ (N1*N2));
		System.out.println("Divison "+ (N1/N2));
	}
}
