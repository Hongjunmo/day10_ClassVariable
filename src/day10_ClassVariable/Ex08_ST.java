package day10_ClassVariable;

import java.util.Scanner;

public class Ex08_ST {
	int age;
	String name;
	public void display() {
		System.out.println("이름 : " + this.name + "\n나이 : " + this.age);

	}
	public void in() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 :");
		name = scan.next();
		System.out.print("나이 입력 :");
		age = scan.nextInt();
		
	}
	
}
