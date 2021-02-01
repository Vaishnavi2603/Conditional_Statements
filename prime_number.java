package Conditional_Statements;

public class prime_number {

	public static void main(String[] args) {
		for(int i=10;i<=99;i++)
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

	}

}
