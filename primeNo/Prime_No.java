package primeNo;

import java.util.Scanner;

public class Prime_No {

	public static void main(String[] args) {
	int num,i,k=0,p=0;
	System.out.println("Enter no to Check");
	Scanner sc = new Scanner(System.in);
    num=sc.nextInt();
    for(i=2;i<=num;i++)
    {
    	if(num%i==0)
    	{
    		k++;
    		System.out.println(i);
    	}
    	
    }
    if(k<=1)
    {
    	System.out.print("The the number enter is a Prime Number");
    	//System.out.println(k);
    }
    else
    {
    	System.out.print("IS not a prime number!!\n");
    	System.out.println("divisible by " + k + " Number");
    }
    sc.close();
	}
	
	

}
