package Conditional_Statements;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		int temp,num,count,rev=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = input.nextInt();
		temp = num;
		while(num != 0)
		{
			count = num % 10;
			rev = rev*10 + count;
			num = num/10;
		}
		if(temp == rev)
			System.out.println("The given number is pallindrome ");
		else
			System.out.println("The given number is not pallindrome ");
		
		input.close();
	}
}