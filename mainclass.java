package Multithreading;

class ThreadClass1 extends Thread{
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println("Thread class 1");
		}
}
}
class ThreadClass2 extends Thread{
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Thread class 2");
		}
	}
}
public class mainclass {
	public static void main(String[] args) {
		ThreadClass1 tc1= new ThreadClass1();
		ThreadClass2 tc2= new ThreadClass2();
		
		tc1.start();
		tc2.start();
	}
	
}
