//Calculate square of a number using a function
import java.util.*;

class Square
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scanner.nextInt(); //Input a number
		
		int square=square(number); //Pass number to square function
		System.out.println(number+"*1="+number+", Square:"+square); //Display square value
	}
	
	public static int square(int num)
	{
		int square=num*num;   //Calculate square value
		return square;
	}
}
