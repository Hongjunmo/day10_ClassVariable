package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {
	
	public final String KOREA = "���ѹα�";
	public void func() {
		System.out.println("������ KOREA: "+ KOREA);
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է� : ");
//		KOREA=scan.next();
		System.out.println("������ KOREA : " + KOREA);
	}

}