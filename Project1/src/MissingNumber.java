import java.util.Scanner;

public class MissingNumber {
	public static void main(String args[])
	{
		int i,j,k=0,len,swap=0,minimum;
		int[] array=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		len=sc.nextInt();
		System.out.println("Enter array elements");
		for(i=0;i<len;i++)
			array[i]=sc.nextInt();
		minimum=array[0];
		for(i=0;i<len;i++)
		{
			if(minimum>array[i])
				minimum=array[i];
		}
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(array[j]<array[i])
				{
					swap=array[j];
					array[j]=array[i];
					array[i]=swap;	
				}
			}
		}
		int[] arrCopy=new int[len+1];
		for(i=0;i<len;i++)
		{
			arrCopy[i]=minimum;
			minimum++;
		}
		for(i=0;i<len;i++)
		{
			if(array[i]==arrCopy[k])
			{
				k++;
				continue;
			}
			else
			{
				System.out.println("Missing number is "+arrCopy[k]);
				break;
			}
		}
	}

}
