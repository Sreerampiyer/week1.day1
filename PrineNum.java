package week1.day1;

public class PrineNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		boolean prime = true;
		
		for(int i=2;i<n;i++)
		{
			if(n % i == 0)
			{
				prime = false;
				break;
				
			}}
		if(prime == true)
			{
			
			System.out.println("number is Prime");
			}
		else
			{
				System.out.println(" Not prime");
			}
		}
		
	}

