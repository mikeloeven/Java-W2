import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToIntBiFunction;
public class Stringbuffer {

	public static void main(String[] args) {	
	Scanner keyboard = new Scanner(System.in);
	String concat = new String();
	StringBuffer concatB = new StringBuffer();
	String one = keyboard.nextLine();
	String two = keyboard.nextLine();
	String three = keyboard.nextLine();
	
	concat = one+two+three;
	concatB.append(one);
	concatB.append(two);
	concatB.append(three);
	int test = 0xffff;
	
	System.out.println(concat);
	System.out.println(concatB);
	System.out.println(test);
	
		
}
}