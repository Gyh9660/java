package chap06_07.Ex06;

//���� �ʱ�ȭ ���� : �����ڿ� ���� static �ʵ��� ���� �ʱ�ȭ�ϴ� ����

//�����ڿ� static ����:
	// - ������ : �ν��Ͻ� �ʵ带 �ʱ�ȭ, ���� �ʵ��� ���� �ʱ�ȭ
	// - static ����: static �ʵ��� ���� �ʱ�ȭ, �ν��Ͻ� �ʵ��� ���� �ʱ�ȭ �Ҽ�����.
	/*
	 * Java���� �ʱ�ȭ ����?

������ ��ü�� ���ʷ� ���� �־��ִ� ��
�ڹٿ��� �ʱ�ȭ �ϴ� ������?
Ŭ���� �������� ������ ��쿡��
�����Ϸ��� �ڵ����� �� �Ҵ��� ���ֳ�
�޼ҵ� �������� ������ ��쿡��
�ڵ����� ���� �Ҵ���� �ʱ� ������
������ �߻��ؼ� �׷���
	 */
class E{
	
	int a;
	static int b; //��ü ���� ���̵� ȣ��
	static int c = 10;
	static { //����(static) �ʱ�ȭ ����:��ü ���� ���� Ŭ���� ������ ȣ���Ҷ� �ʱ�ȭ
		//a=3 ; //������ �߻�, �ν��Ͻ� �ʵ�� �ʱ�ȭ �Ҽ� ����.
		b = 5;
		System.out.println("Ŭ���� E�� �ε��Ǿ����ϴ�. ���� b : "+b );
	}
	E(){		//������ : ��üȭ�� �Ҷ� �ʵ��� ���� �ʱ�ȭ
		a=3;	//�ν��Ͻ� �ʵ� �ʱ�ȭ
		b=10;	//static �ʵ� �ʱ�ȭ
	}
}

public class Static_3 {

	public static void main(String[] args) {
		System.out.println(E.b); //��ü �������� E.b�� ȣ�� �ɶ� static ������ �۵��ȴ�.(������ ȣ�������)
		E e = new E();
		System.out.println(e.a);
		System.out.println(E.c);
		System.out.println(e.c);
	}

}