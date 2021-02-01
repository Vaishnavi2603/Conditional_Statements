package Conditional_Statements;

import java.util.Scanner;

public class Switch_colour {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the Colour Code : ");
		
		char choice = ch.next().charAt(0);
		switch(choice)
		{
		case 'R' :
		case 'r' :
			System.out.println("Red"); 
			break;
		
		case 'B' :
		case 'b' :
			System.out.println("Blue");
			break;
			
		case 'G' :
		case 'g' :
			System.out.println("Green");
			break;
			
		case 'O' :
		case 'o' :
			System.out.println("Orange");
			break;
			
		case 'Y' :
		case 'y' :
			System.out.println("Yellow");
			break;
			
		case 'W' :
		case 'w' :
			System.out.println("White");
			break;
			
		default :
			System.out.println("Invalid Code");
			break;
		}
		ch.close();
	}
}