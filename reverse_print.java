package Conditional_Statements;

import java.util.Scanner;

public class reverse_print {

	public static void main(String[] args) {
		int rev=0,num,count;
		System.out.println("Enter the number : ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		while(num != 0)
		{
			count = num % 10;
			rev = rev*10 + count;
			num = num/10;
		}
		System.out.println("The number in reversed order is : " + rev);
		input.close();
	}

}