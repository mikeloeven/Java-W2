import java.lang.Throwable;
import java.lang.Exception;
import java.time.temporal.JulianFields;
import java.util.Arrays;
import java.util.Scanner;
import java.text.*;


public class SentinelValues {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Enter any number of signed ints last value must be 0");
		Scanner keyboard = new Scanner(System.in);
		int Neg =0;
		int Pos =0;
		int Tot =0;
		int avg = 0;
		int eval = keyboard.nextInt();
		while (eval != 0)
		{
			if(eval>0)
				{
					Pos++;
					Tot++;
					avg+=eval;
				}
			else if(eval<0)
				{
					Neg++;
					Tot++;
					avg+=eval;
				}
			eval=keyboard.nextInt();
			
			
		}
		
		avg/=Tot;
		System.out.println("TOTALS \n Positive Numbers: " + Pos + "\n Negative Numbers: " + Neg + "\n Total Ints: " + Tot + "\n Avg Value: "+avg);
		
		
		
		
	}

}
