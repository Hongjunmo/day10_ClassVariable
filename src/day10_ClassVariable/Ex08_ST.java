package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	int age;
	String name;
	public void display() {
		System.out.println("�̸� : " + this.name + "\n���� : " + this.age);

	}
	public void in() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� �Է� :");
		name = scan.next();
		System.out.print("���� �Է� :");
		age = scan.nextInt();
		
	}
	
}
