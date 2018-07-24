//To find Armstrong numbers in a given range of numbers
import java.util.*;
class ArmsRange
{
	public static void main(String args[])
	{
		int remainder,sum=0,number;
		System.out.println("Armstrong numbers from 100 to 999 are");
		for(int i=100;i<1000;i++)
		{
				sum=0;        //Initialise sum of cubes of digits for each number to be 0
				number=i;     //Copy the number 
				while(number>0)
				{
					remainder=number%10;
					sum=sum+(remainder*remainder*remainder);
					number=number/10;
				}            //Store the sum of cubes of digits of the number in 'sum'
				if(i==sum)   //If number is same as sum, it is armstrong, so display that number
				System.out.print(i+" ");
		}
	}
}