import java.lang.Throwable;
import java.lang.Exception;
import java.time.temporal.JulianFields;
import java.util.Arrays;
import java.util.Scanner;
import java.text.*;
public class HighScore {
	
	public static void main(String[] args)
	
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Number Of Students: ");
		//number of students
		int students = keyboard.nextInt();
		
		String[] name = new String[students];
		int[] score = new int[students];
		
		for(int i=0;i<(students);i++)
		{
			System.out.println("Enter Name of Student " + (i+1) +": ");
			name[i] = keyboard.next();
			System.out.println("Enter Score for Student " + (i+1) +": ");
			score[i] = keyboard.nextInt();
		}
		
		System.out.println();
		int pos = 0;
		int highscore = score[0];
		for (int i=0; i < score.length; i++) 
		{
			if(score[i]>highscore)
			{
				highscore = score[i];
				pos=i;
			}
		}
		
		System.out.println("The Highest Score is "+ highscore + " Belonging To " + name[pos]);
		
		
		
		
		
	}

}
