import java.util.*;
public class SortPalindrome {
public static void main(String args[])
{
	int i,j,position=0,swap=0;
	int[] len=new int[10];
	int[] location=new int[10];
	String[] str=new String[10];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 10 strings");
	for(i=0;i<10;i++)
	str[i]=sc.nextLine();
	for(i=0;i<10;i++)
	{
		StringBuffer strcopy =new StringBuffer(str[i]);
		StringBuffer strrev=strcopy.reverse();
		if(strrev.toString().equals(str[i])) {
			location[position]=i;
			position++;
		}
	}
	for(i=0;i<position;i++)
		len[i]=str[location[i]].length();	
	for(i=0;i<position;i++)
	{
		for(j=0;j<position-1;j++)
		{
			if(len[j]<len[j+1])
			{
				swap=len[j];
				len[j]=len[j+1];
				len[j+1]=swap;
				swap=location[j];
				location[j]=location[j+1];
				location[j+1]=swap;
			}
		}
	}
	System.out.println("Sorted palindromes are");
	for(i=0;i<position;i++)
		System.out.println(str[location[i]]);
}
}

