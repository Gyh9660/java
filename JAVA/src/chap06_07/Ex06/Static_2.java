package chap06_07.Ex06;

//static Ű�� �Ҵ�� �ʵ�� ��簴ü���� �����ؼ� ����ϴ� �޸� ����.

class D{
	int m =3; //�ν��Ͻ� �ʵ� :��üȭ �ؼ� ���
	static int n = 5; //static �ʵ� : ��üȭ �ؼ� ���, D.n (��üȭ���� �ʰ� Ŭ���������� ȣ��)						//��� ��ü���� �����ϴ� �ʵ�
					
	
	
	
}





public class Static_2 {

	public static void main(String[] args) {
		D d1 = new D(); //��ü ����
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
	
		//�ν��Ͻ� �ʵ� : �� ��ü���� ���� ���� �ʰ� �� ��ü������ ���.
		d1.m = 5;
		d2.m = 6;
		d3.m = 7;
		d4.m = 8;
		System.out.println(d1.m);//5
		System.out.println(d2.m);//6
		System.out.println(d3.m);//7
		System.out.println(d4.m);//8
		
		//���� �ʵ� 			//��ü �̸����� static �ʵ带 ȣ��
		d1.n =10;
		d2.n =100;
		System.out.println(d1.n);//
		System.out.println(d2.n);//
		System.out.println(d3.n);//
		System.out.println(d4.n);//
		
		D.n = 200; 		//Ŭ���� �̸����� ȣ�� , ��ü ���� ���� ȣ�� ����
		System.out.println(d1.n);
		System.out.println(d2.n);
		System.out.println(d3.n);
		System.out.println(d4.n);
		
		System.out.println("==================");
		System.out.println(d1.m);
		System.out.println(d2.m);
		System.out.println(d3.m);
		System.out.println(d4.m);
		
		
		
	}

}