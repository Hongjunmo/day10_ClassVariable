package day10_ClassVariable;

import java.util.Scanner;

public class Ex06_final {
	
	public final String KOREA = "대한민국";
	public void func() {
		System.out.println("변경전 KOREA: "+ KOREA);
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
//		KOREA=scan.next();
		System.out.println("변경후 KOREA : " + KOREA);
	}

}
