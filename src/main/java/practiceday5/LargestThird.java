package practiceday5;

import java.util.Scanner;

public class LargestThird 
{
	public static void main(String[] args) 
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.print("largest is :"+num1);
		}else if(num2>num1 && num2>num3) 
		{
			System.out.print("largest is :"+num2);
		}
		else {
			System.out.print("largest is :"+num3);
		}
		

	}


}
