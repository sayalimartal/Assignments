import java.util.Scanner;
public class ModifySentence {
public static void main(String args[])
{
	int position,count=0;	
	String sentence=new String();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a sentence");
	sentence=sc.nextLine();
	System.out.println("Word to be deleted:");
	String wordDelete=new String();
	wordDelete=sc.nextLine();
	int wordLen=wordDelete.length();
	System.out.println("Word position in the sentence:");
	position=sc.nextInt();
	sentence=sentence.replaceAll("( )+"," ");
	int len = sentence.length();
	for (int i = 0; i < len; i++) {
		if (sentence.charAt(i) == ' ')
			count++;
		if (count == position-1) {
			StringBuffer sent=new StringBuffer(sentence);
			sent=sent.replace(i+1, i+wordLen+1, " ");
			sentence=sent.toString();
			break;
		}		
	}
    sentence=sentence.replaceAll("( )+"," ");
    System.out.println(sentence);
}
}