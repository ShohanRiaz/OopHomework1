package oopHomework;

public class Iphone1 {
	private String Name;
	private int price;
	private char grade;
	private boolean madeInUSA;
	
	public Iphone1() {
		System.out.println("This is from Superclass Iphone1");
	}
	
	public Iphone1(String name, int price, char grade, boolean madeInUSA) {
		this.Name = name;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My first phone is: "+ name +", Price is:  $"+ price + ", Grade is:   "+ grade + ", Made in USA:  "+ madeInUSA);
	}
	
	public void iPhoneInfo() {
		System.out.println("My first iPhone is iPhone 1");
	}
	public void property() {
		System.out.println("It came in market in 2000");
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public boolean isMadeInUSA() {
		return madeInUSA;
	}
	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}
	
}
