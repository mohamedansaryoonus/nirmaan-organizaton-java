package day5;

public class laptop {
	String name="0";
	String proc="0";
	int price=0;
	int ram=0;
	public static void main(String[]args)
	{
		laptop lap1=new laptop();
		lap1.name="dell";
		lap1.proc="i5";
		lap1.ram=8;
		lap1.price=40000;
		
		laptop lap2=new laptop();
		lap2.name="lenova";
		lap2.proc="i7";
		lap2.ram=8;
		lap2.price=50000;
		
		laptop lap3=new laptop();
		System.out.println(lap3.price);
		
	}
}
