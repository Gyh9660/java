package chap06_07.Ex06;

//��ü�� �ʵ忡 ���� �Ҵ� �ϴ� ��� : 3����
	//1. �ʵ忡 ���� ����
		//<== ��ü�� ������
	//2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο��ϴ� ���(��Ʈ���� �ȴ�) 
		//<==��ü�� ���� �� ��ü�� �����ο�
	//3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� (��Ʈ�� �ȴ�)
		//<== ��ü�� ������ �� �ʱⰪ���� �ʵ忡 ���� �Ҵ�

class Aa{ //1.��ü ������ ���� �ʵ忡 �� �Ҵ�
	String name; //�̸�
	int age;	//����
	String mail;	//�����ּ�
	
	void print() {
		System.out.println("name : "+name+ "age : "+age+ "mail : "+mail);
	}
	
	
}

class Bb{ //2.setter�� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ� 
	
	String name; //�̸�
	int age;	//����
	String mail;	//�����ּ�
	
	void print() {
		System.out.println("name : "+name+ "age : "+age+ "mail : "+mail);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}	
	
	
	
}

class Cc{ //3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ�
	
	String name; //�̸�
	int age;	//����
	String mail;	//�����ּ�
	
	Cc(){
		name = "�̼���";
		age = 20;
		mail = "ccc@ccc.com";
	}
	
	Cc(String name, int age, String mail){ //�����ڿ��� �Ű����� 3���� �޾Ƽ�
		this.name =name;
		this.age =age;
		this.mail=mail;
	}
	void print() {
		System.out.println("name : "+name+ "age : "+age+ "mail : "+mail);
	}
	
	
}

public class FieldOfValue {

	public static void main(String[] args) {

		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�.
		Aa aa = new Aa(); //��ü�� ������ �� �Ҵ�
		aa.name = "ȫ�浿";
		aa.age = 18;
		aa.mail = "aaa@aaa.com";
		aa.print();
		//2. ��ü�� setter�� ���ؼ� �ʵ��� ���� �ο�.
		System.out.println();
		Bb bb = new Bb(); //��ü�� ������ �� �Ҵ�
		bb.setName("�Ż��Ӵ�");
		bb.setAge(19);
		bb.setMail("bbb@bbb.com");
		bb.print();
		//3. �����ڸ� ����ؼ� �ʵ��� ���� �ο�.(��ü�� �����ҋ� �ʵ��� ���� �ʱ�ȭ)
		System.out.println();
		Cc cc = new Cc();
		cc.print();
		Cc ccc = new Cc("�������",20,"cc@cc.co.kr"); 	//��ü�� �����Ҷ� �� �ο�
		ccc.print();
	}

}