import java.util.Scanner;

public class Calculater {

	public static void main(String args[])
	{
		Scanner user_input= new Scanner(System.in);
		
		double input1, input2, answer;
		String question;
		
		
		System.out.println("Enter first number:");
		input1 = user_input.nextDouble();
		
		System.out.println("Enter second number:");
		input2 = user_input.nextDouble();
		
		System.out.println("Enter for results do you want the Sum(A) Subtract(B) Product(C) Divide(D):");
		question = user_input.next();
		question= question.toUpperCase();
		
		switch(question)
		{
		case "A":
			answer = input1 + input2;
			System.out.println("The Sum is " + answer);
			break;
		case "B":
			answer = input1 - input2;
			System.out.println("The Subtract is " + answer);
			break;
		case "C":
			answer = input1 * input2;
			System.out.println("The Product is " + answer);
			break;
		case "D":
			answer = input1 / input2;
			System.out.println("The Sum is " + answer);
			break;
		default:
			System.out.println("Error");
			
		}
		
	
		
		
		
		
	}
}
