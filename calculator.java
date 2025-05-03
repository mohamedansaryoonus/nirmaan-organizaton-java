package day4;
import java.util.Scanner;
public class calculator {
	
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number ");
		int num2 = sc.nextInt();
		
		
		System.out.println("Enter 1 for add ");
		System.out.println("Enter 2 for sub ");
		System.out.println("Enter 3 for mul ");
		System.out.println("Enter 4 for div");
		int num=sc.nextInt();
		
		switch (num){
		
		case 1:
			System.out.println("Addition:"+(num1+num2));
			break;
		case 2:
			System.out.println("Subraction:"+(num1-num2));
			break;
		case 3:
			System.out.println("Multilication:"+(num1*num2));
			break;
		case 4:
			System.out.println("Division:"+(num1/num2));
			break;
		
			
		
		}
		
		
		
		
	}

}
