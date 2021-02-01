package Conditional_Statements;

import java.util.Scanner ;

public class check_prime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = input.nextInt();
		int flag=0;
		if(n==0 || n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for(int i=2;i<=(n/2);i++)
			{
				if(n % i == 0)
				{
					System.out.println(n+" is not prime number");
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.println(n+" is prime number");
		}
		input.close();
	}
}