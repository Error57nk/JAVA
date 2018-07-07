package Percentage_Calculator;

import java.util.Scanner;

public class PercentageCalci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Percentage %");
		double p=sc.nextDouble();
		System.out.println("Enter the total Amount to get %");
		double t=sc.nextDouble();
		double result=(p/100)*t;  //Calculation formula
		System.out.println(p + " % of " + t +" is "+ result);
		sc.close();

	}

}
 