package day15;

public class practicestr {
	public static void main(String[]args)
	{
		String prac="PracticeJava";
		String prac1="PRACTICEJAVA";
		
		boolean istrue=prac.startsWith("p");
		boolean ishere=prac1.endsWith("a");
		
		System.out.println(prac.length());
		System.out.println(prac.charAt(2));
		System.out.println(prac.substring(2));
		System.out.println(prac.substring(2,8));
		System.out.println(prac1.toLowerCase());
		System.out.println(prac.toUpperCase());
		System.out.println(prac.equals(prac1));
		System.out.println(prac.equalsIgnoreCase(prac1));
		System.out.println(prac.contains("a"));
		System.out.println(istrue);
		System.out.println(ishere);
	}

}
