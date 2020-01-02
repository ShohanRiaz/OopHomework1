package oopHomework;

public class Iphone6 extends Iphone5{
	public int materials(int a,int b) {
		int total=a+b;
		System.out.println("RAM : "+total);
		return total;
		}
	public int materials(int a,String b) {
		int total=a+(Integer.parseInt(b));
		System.out.println("RAM : "+total);
		return total;
		}
	public static int materials(int a, int b, int c) {
		int total=a+b+c;
		System.out.println("RAM : "+total);
		return total;
		}
	public void iPhone6Info() {
		System.out.println("iPhone 6 was introduced in 2004");
		}

}
