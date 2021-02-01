package Conditional_Statements;

import java.util.Scanner;

public class sum_digits {

	public static void main(String[] args) {
		int sum=0,count=0;
		System.out.println("Enter a number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		while(num != 0)
		{
			count = num % 10;
			num = num/10;
			sum = sum + count;
		}
		System.out.println("The sum of digits is "+sum);
		input.close();
	}
}