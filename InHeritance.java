package day16;



	class vehicle{
		void startengine() {
			System.out.println("vehicle engine started");
		}
	}
	class car{
		void methoddrive () {
			System.out.println("Car is driving");
			
		}
	}
	class Electriccar extends car{
		void chargebattery() {
			System.out.println("Electric car is driving");
		}
	}
	class bike extends vehicle{
		void kickstart() {
			System.out.println("vehicle engine started");
			System.out.println("bike is kicked started");
		}
	}
	public class InHeritance {
	public static void main(String args[])
	{
		bike b=new bike();
		b.startengine();
		b.kickstart();
		Electriccar c=new Electriccar();
		c.chargebattery();
		c.methoddrive();
	}
	}
