package week1.day1;

public class ThrizFiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=30;
		if(number % 3 == 0)
		{
		System.out.println("TRIZZ");	
		}
		
		if(number % 5 == 0)
		{
		System.out.println("FIZZ");	
		}
		
		if(number % 3 == 0 && number % 5 == 0)
		{
		System.out.println("TRIZZ & FIZZ");	
		}
		
		
	}

}
