
import java.util.Scanner;
public class binaryOnes {
private static Scanner input=new Scanner(System.in);
public static void main(String[] args)
{
	int number,ones;
	System.out.println("enter a number to find binary ones");
	number=input.nextInt();
	if(number>0)
	{
		ones=binaryZeros(number);
		System.out.println("printing.......");
		System.out.println(ones);
	}
	else
	{
		System.out.println("enter a positive integer");
	}
	
}
private static int binaryZeros(int number) {
	int r=0,count=0;
	while(number!=0)
	{
		r=number%2;
		if(r==1)
		{
			count++;
		}
		number=number/2;
	}
	return count;
}
}
