package Conditional_Statements;

import java.util.Scanner;

public class n_primenum {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the nth number : ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for(int i=2;i<=n;i++)
		{
			int counter = 0;
			for(int j = i; j>= 1 ; j--)
			{
				if(i % j == 0)
					counter++;
			}
			
			if(counter == 2)
				{
					System.out.print(i);
					System.out.print(" ");
				}	
		}
		input.close();
	}

}
