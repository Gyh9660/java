package chap04;

public class Ex01_IF2 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if ( operator == '+') {
			result = num1 + num2;
		}else if (operator == '-') {
			result = num1 - num2;
		}else if (operator == '*' ) {
			result = num1 * num2;
		}else if ( operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("������ �����Դϴ�.");
			return; //return�̳����� �ؿ� �ȳ����� �׳�����
		}
		
		System.out.println("��� ���� :" + result + "�Դϴ�.");
	}
	
	
}