package day10_ClassVariable;

public class Ex03_Main {
	public static void main(String[] args) {

		/*
		 * Ŭ���� ����
		 * ���α׷� ���۽� ����(�޸𸮿� �ö� ��)
		 * ��� ������ ��밡����
		 * 
		  �ν��Ͻ�(��ü) ����
		  -�ν��Ͻ��� ������ �� (new ��������)
		  ���� ����
		  - Ư�� �������� �����ɶ�
		  - �ش� ���������� ��밡��
		  - �Ǵ� �P�� ������ ���ӵǾ� �ִ� ������ ��� ����
		 */
		
//		int cnt = 0;
//		if(cnt == 0) {
//			int test=1000;
//			System.out.println(cnt);
//			System.out.println(test);
//		}
	
		Ex03_Variable ex = new Ex03_Variable();
		
		int a=ex.variable01();
		ex.variable02(a);
		
	
	}
}
