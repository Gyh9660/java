package chap03;

public class OperatorEx02 {

	public static void main(String[] args) {
		//#ũ�� �� ( <, >, <=, >-) ====> ���� ���� true, false�� ����
		System.out.println(5 < 2); //false
		System.out.println(-5 < 5); //true
		System.out.println(5 <= 5); //true
		System.out.println("===============");
		
		//� �� ( ==(����) , != (���� �ʴ�) ===> ���� ���� true, false�� ���� ==�� ������ true !=�� ���������� true
		
		int a=5;
		int b=2;
		int c=5;
		
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a==c); //true
		System.out.println(a!=c); //false
		
		System.out.println("================");
		//���� �ڷ��� � �� ( ��ü�� �޸��� ������ ��,)
		String str1 = new String ("�ȳ�");
		String str2 = new String ("�ȳ�"); //new������ �����Ǹ޸𸮸� �����߱⋚���� 2���� �޸𸮰� �ٸ�
		
		System.out.println(str1 == str2 );
		
		System.out.println(str1 == str2); //�޸��� ������ �ٸ��⋚���� false�� ���� / ��ü�� �޸��� ������ ��

		
		
		
		
		
	}

}