//To sort an array using Bubblesort technique
import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		int[] array=new int[15];    //Create an array of integers of size 15
		int i,j,swap;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(i=0;i<15;i++)          //Input array elements
			array[i]=scanner.nextInt();
		
		for(i=0;i<14;i++)
		{
			for(j=0;j<14;j++)
			{
				if(array[j]>array[j+1])  //Sort the array in descending order
				{
					swap=array[j];   
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}				
		}
		
		System.out.println("The sorted array is");
		for(i=0;i<15;i++)      //Display the sorted array
			System.out.print(array[i]+" ");
	}
}
