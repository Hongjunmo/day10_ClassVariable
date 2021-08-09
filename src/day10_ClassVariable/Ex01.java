package day10_ClassVariable;

public class Ex01 {
	public static void main(String[] args) {

		/*
		 * 메소드의 이름을 동일하게 만드는것 이름이 같기 때문에 서로 다른 메소드로 인식하기 위해서는 매개변수의 개수나 타입이 달라야 함
		 */

		Ex01_Class ex = new Ex01_Class();

		
		System.out.println(ex.sum(10, 20));
		
		System.out.println(ex.multisum(10, 20, 30));
		System.out.println(ex.sum(10, 19.33212131313));
		System.out.println(ex.sum("test", "hello"));
		

		
		
		
		
	}
}
