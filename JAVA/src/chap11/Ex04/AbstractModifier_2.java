package chap11.Ex04;


//�߻� Ŭ������ ������� �ʴ� ��� :
	//�ڽ�Ŭ�������� �޼ҵ� ���� ���̵� �� �������̵��� ��Ÿ�� ���� �߸� ���� �� �� �ִ�.

class Animal {
	void cry() {}		//������ cry() �������ְ� ������ �������� ����.
}

class Cat extends Animal {
	void cRy() {				//�������̵��� �ƴ� �ڽ�Ŭ�������� ���Ӱ� ���ǵ� �޼ҵ�
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	void Cry() {
		System.out.println("�۸�");
	}
}


public class AbstractModifier_2 {

	public static void main(String[] args) {

		//1. ��ü����
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		//2. �޼ҵ� ȣ��
		a1.cry(); //��Ÿ������ ����� ȣ���� �ȵ�
		a2.cry();
	}

}