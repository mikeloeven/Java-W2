import java.lang.Throwable;
import java.lang.Exception;
import java.time.temporal.JulianFields;
import java.util.Arrays;
import java.util.Scanner;
import java.text.*;
public class HarrisBenedict {
	
	
	
	public static void main(String[] args)
	
	{
		//Welcome Message
		System.out.println("This Program will calculate the number \r of 230 calorie candy bars needed daily \r to maintain your weight \n\n");
		//VAR INIT
		//array BIO 0=age 1=height 2=weight
		int[] BIO = {0,0,0};
		String gender = new String();
		double BMG = 0.0;
		
		//Scan INIT		
		Scanner keyboard = new Scanner(System.in);
		//Input Block
		System.out.println("Enter Your Age In Years:  ");
		BIO[0]=keyboard.nextInt();
		System.out.println("\n\n Enter your Height in Inches:  ");
		BIO[1]=keyboard.nextInt();
		System.out.println("\n\n Enter your Weight in Pounts:  ");
		BIO[2]=keyboard.nextInt();
		
		
		
		
		//sentinel var for gender error
		int gErr = 0;
		//do loop allows invalid gender to be corrected 
		do
		{
			//getting user input for gender is done in here
			System.out.println("\n\n Enter your Gender M/F:  ");
			gender=keyboard.next().toLowerCase();
			System.out.println("\n\n Processing...\n\n");
			
			//perform initial calculations if gender is valid
			if(gender.equals("m"))
			{
				BMG= 66 + (6.3 * BIO[2]) + (12.9 * BIO[1]) - (6.8 * BIO[0]);
				gErr=0;
			}			
			else if(gender.equalsIgnoreCase("f"))
			{
				BMG= 655 + (4.3 * BIO[2]) + (4.7 * BIO[1]) - (4.7 * BIO[0]);
				gErr=0;
			}			
			else
			{
				System.out.println("\n\n INVALID GENDER \n\n");
				gErr=1;
			}
		} while (gErr==1);
		
				
				
			
		
		//get activity level in int
		int activity = 0;
		System.out.println("Almost Finished \n Are you \n 1:Sedentary \n 2:Somewhat Active \n 3:Active \n 4:Highly Active \n ::   ");
		
		//apply percentages
		
		int bmgErr=0;
		do
		{
			
			
		//added the try catch because i kept blowing it up by accidently entering strings 
		try{
			activity = keyboard.nextInt();
			
			switch(activity)
		{
			case 1:
				BMG += BMG * 0.20;
				bmgErr=0;
				break;
			case 2:
				BMG += BMG * 0.30;
				bmgErr=0;
				break;
			case 3:
				BMG += BMG * 0.40;
				bmgErr=0;
				break;
			case 4: 
				BMG += BMG * 0.50;
				bmgErr=0;
				break;
			default:
				System.out.println("\n\n INVALID ENTRY \n\n Are you \n 1:Sedentary \n 2:Somewhat Active \n 3:Active \n 4:Highly Active \n ::   ");
				bmgErr=1;
				break;
				
		
		}
		}
		catch(Exception e)
		{
			System.out.println("\n\n INVALID ENTRY \n\n Are you \n 1:Sedentary \n 2:Somewhat Active \n 3:Active \n 4:Highly Active \n ::   ");
			keyboard.next();
			bmgErr=1;			
		}
		}while (bmgErr==1);
		//format it to 2 decimals
		DecimalFormat dOut = new DecimalFormat("#.##");
		System.out.println("\n\n Processing...\n\n");
		
		System.out.println("Your BMR = " + dOut.format(BMG) + "\n You would need " + dOut.format((BMG / 230)) + " \n 230 Calorie Candy Bars Per Day" );
		
		
		
		
		
		
	}
	
	
	
	

}
