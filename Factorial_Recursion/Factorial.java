package Factorial_Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for factorial");
		int n=sc.nextInt();
		int b = fact(n);
		System.out.println("Factorial of " + n + "is "+ b);
		sc.close();
		
	}

	private static int fact(int c) {
		
		if(c<=1)
			return(1);
			
		else
			{
				return(c*fact(c-1));
			}
		}
	}

