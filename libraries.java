package day5;

public class libraries {
	String bookname="";
	String authorname="";
	int price=0;
	
	public static void main(String[]args)
	{
		
		libraries li=new libraries();	//Creating for an object
		li.authorname="james van rossum";
		li.bookname="python";
		li.price=300;
		
		
		
		libraries li1=new libraries();
		li1.authorname="ramanujam";
		li1.bookname="maths";
		li1.price=500;

		
		libraries li2=new libraries();
		li2.authorname="james rhonson";
		li2.bookname="java";
		li2.price=300;
		
		libraries li3=new libraries();
		li3.authorname="ansar";
		li3.bookname="php";
		li3.price=600;
		
		System.out.println(li.authorname);
		System.out.println(li.bookname);
		System.out.println(li.price);
		
		System.out.println(li1.authorname);
		System.out.println(li1.bookname);
		System.out.println(li1.price);
		
		System.out.println(li2.authorname);
		System.out.println(li2.bookname);
		System.out.println(li2.price);
		
		System.out.println(li3.authorname);
		System.out.println(li3.bookname);
		System.out.println(li3.price);
		
		
		
	}

}
