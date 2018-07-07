package PalindomeNumber;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Check");
		int n=sc.nextInt();
		int num =n;
		int rev=0,rmd;
		while(num>0)
		{
			rmd=num%10;
			rev=rev*10+rmd;
			num=num/10;
		}
		if(n==rev)
		{
			System.out.println("Is a palindrome Number "+ rev);
		}
		else
			System.out.println("Is a NOT a palindrome Number "+ rev);
		sc.close();
	}

}
