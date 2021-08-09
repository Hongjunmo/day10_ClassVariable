package day10_ClassVariable;

class User1{
	String a=Ex07_final.KOREA;
	public void func () {
		System.out.println("KOREA : " +a);
	}
}
class User2{
	public Ex07_final user = new Ex07_final();
	public void func () {
		System.out.println("KOREA : " + user.KOREA);
	}
}

public class Ex07_Main {
	public static void main(String[] args) {
		
		User1 user = new User1();
		User2 user2 = new User2();
		user.func();
		user2.func();
		
	}
}
