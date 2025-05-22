package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionex {
	
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	
		try {
			System.out.println("Enter the number");	
			int num=sc.nextInt();	
			System.out.println(10/num);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		catch(InputMismatchException i) {
			System.out.println("InputMismatch error occured");
		}
		catch(Exception e) {
			System.out.println("error occured");
		}
	}

}
