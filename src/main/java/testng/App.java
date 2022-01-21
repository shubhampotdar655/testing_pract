package testng;

public class App 
{
    public static void main( String[] args )
    {
    	
    	int number=100;  
    	System.out.print("List of even numbers from 1 to "+number+": ");  
    	for (int i=200; i>=number; i--)   
    	{  
    	//logic to check if the number is even or not  
    	//if i%2 is equal to zero, the number is even  
    	if (i%2==0)   
    	{  
    	System.out.print(i + " ");  
    	}  
    	}
    }
}
