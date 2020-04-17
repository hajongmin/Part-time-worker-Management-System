package Staff;

import java.util.Scanner;

public class Staff {
	protected StaffKind kind = StaffKind.Regularworker;
	protected String name;	
	protected int age;
	protected int phonenumber;
	protected int workhour; 
	//자식에겐 상속되는데 그 외 외부 클래스에선 접근 못하는, 같은 패키지안에선 포함되지만 다른데서는 접근 못하도록 하는 파트

	public Staff() {

	}

	public Staff(String name, int age, int phonenumber, int workhour) {
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.workhour = workhour;
	}


	public StaffKind getKind() {
		return kind;
	}

	public void setKind(StaffKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getWorkhour() {
		return workhour;
	}

	public void setWorkhour(int workhour) {
		this.workhour = workhour;
	}


	public void printinfo() {
		System.out.print("name : " + name + ", " + "age : " + age + ", " + "phonenumer : " + phonenumber + ", "
				+ "workhour : " + workhour + "\n\n");
	}

	public void getUserInput(Scanner input) {
		System.out.println("***Add the staff*** ");

		System.out.println("Name : ");
		String name = input.next();
		this.setName(name);

		System.out.println("age : ");
		int age = input.nextInt();
		this.setAge(age);

		System.out.println("Phone number : ");
		int phonenumber = input.nextInt();
		this.setPhonenumber(phonenumber);

		System.out.println("working hour : ");
		int workhour = input.nextInt();
		this.setWorkhour(workhour);

	}
} 
