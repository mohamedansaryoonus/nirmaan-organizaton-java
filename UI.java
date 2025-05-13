package day16;

import java.util.Scanner;
 
public class UI {
	
public static void main(String[]args)
	{
		calculator c= new calculator();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc .nextInt();
		
		System.out.println("press the key 1");
		
		System.out.println("press the key 2");
		
		System.out.println("press the key 3");
		
		System.out.println("press the key 4");
		
		System.out.println("press the key");
		int num=sc.nextInt();
		
		switch (key) {
		case1:
		{
			System.out.println(c.add(num1,num2));
			break;
			
		}
		case2:
		{
			System.out.println(c.sub(num1, num2));
			break;
		}
		case3:
			System.out.println(c.mul(num1,num2)):
			break;
		
		
		
		
	}
		
		
	}

}
