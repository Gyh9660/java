package chap06_07.Ex01;

class AA {
	String name; //�ʵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ��밡�� (Heap ������ ���� ����)
	int age;
	String email;
	
	AA(){ } //�⺻ ������, ������ ����, �ٸ������ڰ� ������ ���, �⺻�����ڴ� ���� �ϸ� ����.
	public String getName() { //�޼ҵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ��밡��
		return name;		  // Heap ������ �ּҸ� ����.Ŭ������������ �޼ҵ念���� ����
						//return : �޼ҵ带 ȣ���ϴ� ������ ������ ���� �����ش�.
	}
	public void setName(String name) { //void : ���ϰ��� ���ٸ� �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}

public class CreateObject {

	public static void main(String[] args) {

		AA aa = new AA(); // AAŬ���� (���赵)�� aa(��ü)�� ����
		//AA�� Ŭ�����̸�, aa : ��ü��(�ν��Ͻ���)���Ƿλ���,
		// new :Heap ������ �ʵ�� �޼ҵ带 Heap������ �����ض�
		//AA() : ������ => ��ü�� �ʵ尪�� �ʱ�ȭ�Ҷ� ���,�����ڵ� �ϳ��� �޼ҵ�,
						//1.��Ģ: ������ �̸��� Ŭ�����̸��� ������ �޼ҵ�,
						//2.��Ģ: ����Ÿ���� ����.
						//3.��Ģ: �������� �Ű������� ���� �����ڸ� �⺻������
						//4.��Ģ: �⺻ �����ڴ� ��������
						//5.��Ģ: ��ü�� �����Ҷ� �ݵ�� �����ڸ� ȣ��
		// ��ü�� �޼ҵ� ȣ�� 
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("===========");
		
		//��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//===================================

		// �޼ҵ� ȣ��
		
		//setters :��ü�� �޸𸮿� ���� �Ҵ� �Ҷ�
		System.out.println("==========");
		aa.setName("ȫ�浿"); //��ü�� ������ ���� �Ҵ�
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		//getters : ��ü�� �޸��� ���� ������ �ö�
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		System.out.println("==========");
		
		AA bb = new AA();
		bb.setName("������");
		bb.setAge(50);
		bb.setEmail("bbb@bbb.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("==========");
		
		AA cc = new AA();
		cc.setName("�Ż��Ӵ�");
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		System.out.println("==========");
		
		
		
		
		
	}

}