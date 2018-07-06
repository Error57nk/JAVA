package primenoGenerator;

import java.util.Scanner;

public class PrimeNo_Gen {

	public static void main(String[] args) {
		int num,i=2,k=0,j,p=0;
		System.out.println("How Many Prime Number You Want");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("The Prime Number are :- \n");
		do
		{   
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					k++;
				}
			}
			if(k<=1)
			{
				System.out.println(i);
				p++;
			}
			k=0;
			i++;
		}while(num!=p);
		sc.close();

	}

}
