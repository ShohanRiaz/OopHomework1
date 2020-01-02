package oopHomework;

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 ip1 = new Iphone1();
		ip1.setName("I bought this phone in 2000");
		ip1.setPrice(750);
		ip1.setGrade('A');
		ip1.setMadeInUSA(false);
		System.out.println(ip1.getName()+", the price was $"+ip1.getPrice()+", grade is " +ip1.getGrade()+", made in USA: - "+ip1.isMadeInUSA()  );
		
		ip1.iPhoneInfo();
		ip1.property();
		
		Iphone2 ip2 = new Iphone2();
		ip2.iphone2Info();
		
		
		Iphone3 ip3 = new Iphone3();
		ip3.iPhone3Info();
		
		Iphone4 ip4 = new Iphone4();
		ip4.iPhone4Info();
		
		Iphone5 ip5 = new Iphone5();
		ip5.iPhone5Info();
		
		Iphone6 ip6 = new Iphone6();
		ip6.iPhone6Info();
		ip6.materials(16, 8);
		ip6.materials(32, 20);
		Iphone6.materials(64, 128, 40);
	}

}
/* 
1. Iphone 1 = Super Class or parent class and rest of the classes are sub class or child class
2. Iphone 2 extends Iphone 1, Iphone 3 extends Iphone 1 (both Iphone 2 &3 are child class)- these are called 'Hierarchical' inheritance
3. Iphone 4 extends Iphone 2,  - this is called 'Single' inheritance
4. Iphone 5 extends Iphone 4,  Iphone 6 extends Iphone 5 - these are called ' Multilevel inheritance
*/