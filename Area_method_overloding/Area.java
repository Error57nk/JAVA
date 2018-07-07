package Area_method_overloding;

public class Area {
	
	public static void main(String[] args)
	{
		
		areaz(5,4);
		areaz(9);
		areaz(3,7.45);
		
	}
	public static void areaz(int l,int b)
	{
		System.out.println(l*b + " YOU are in 1st Method");
	}
	public static void areaz(int l) 
	{
		System.out.println(l*l + " YOU are in 2nd Method");
	}
	public static void areaz(int b,double h) 
	{
		System.out.println((h*b)/2 + " YOU are in 3rd Method");
	}

}
