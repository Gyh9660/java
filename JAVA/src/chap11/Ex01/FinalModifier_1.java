package chap11.Ex01;

/*
 *  Final : ������
 *  	- �ʵ��, ���������� �տ� : ��� , final double PI = 3.14;
 *  			: ����� ���� ������ �� ����.
 *  			: ��� ������ ���� ���� , ��ü�� �޼ҵ尡 ����� ��쿡�� ȣ���� ����
 *  
 *  	- �޼ҵ�� : �������̵��� �Ұ��� �޼ҵ� (�θ� Ŭ�������� �ڽ� Ŭ�������� �޼ҵ� �������̵��� �Ұ��ϵ���)
 *  			: final void print (){}
 *  	- Ŭ������ : ����� �Ұ��� Ŭ����
 *  			: final class A {}  <== �ڽ�Ŭ������ ���� �ʴ� ������ Ŭ����
 */	

class A1 {
	int a = 3;		//�ʵ��, ���������� = �ҹ��ڸ� ���, �������ڸ� �̾������ �̾����� ù�� �빮��
	final int B= 5; //final�� �Ϲ������� ���� �빮��, ����� �빮�ڷ� ���, ���� ���� �Ҽ� ����.
	
}
class A2 {
	int a;
	final int B;
	A2(){
		a = 3;
		B = 5;
	}
}
class A3 {
	int a =3;		//�ʵ� : ���� ����
	final int b =5;	//��� : ���� ���� �Ұ�
	A3(){
		a= 5;
	//	b= 10; //[�� �� �� ��] Final�� ���� �����Ҽ�����.
	}
}
class B {
	void bcd() {			//���� ���� : �޼ҵ忡�� ������ ���� (�޼ҵ� ȣ���� ������ ���������� �����)
		int a =3;		//���� ������ ������ ���� �Ҵ�. �޼ҵ� ȣ���� ������ �����
		final int B = 5;	//����� Ŭ���� ������ ��������� ����, �޼ҵ尡 ������� ��������� ��������
		a=7;
		//B=9; //final�� ���� �����Ҽ� ����. [ �� �� �� �� ] ���
	}
}

public class FinalModifier_1 {

	public static void main(String[] args) {

		
		
	}

}