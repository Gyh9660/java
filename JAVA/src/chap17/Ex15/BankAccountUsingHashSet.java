package chap17.Ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
//�Ϸ� �ð� : ���� ��ħ 9: 30�б��� , p.jangwoo@gmail.com, �� ����Կ��� ���� 
import java.util.Scanner;
import java.util.Set;

//Set �ߺ�x �ε���x 



class Account{ //���������������ϴ� ��ü ,�߿��� �ʵ�,private ĸ��ȭ 
				//DTO, VO<==���������� �ʵ��ǰ��� �����ϰ� �����ϴ� ���
				//��ü�� �ʵ�����(x) ������(o) getter,setter(o)
	private String ano ; 	//���� ��ȣ
	private String owner;   //���� �� , �̸�
	private int balance; 	// ���� �ݾ�, 
		
	Account (String ano, String owner, int balance){ //��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	//getter,setter

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
		public boolean equals(Object obj) {
			if (obj instanceof Account) {
				if(this.ano.equals(((Account)obj).ano)) {//���� : �߸� �ٿ�ĳ������ �� ��� : ���ܰ� �߻���
					return true;//this.ano == ((Account)obj).ano�� �ϸ� �ȵ�.<<�׵��Ȱ�� �ȵ�����
				}
			}
			return false;
		
		}
	
	@Override
		public int hashCode() {
			return Objects.hash(ano);
		}
}

public class BankAccountUsingHashSet {
	//�÷��� (ArrayList<E>)�� ����ؼ� Account ��ü ���
	//�迭�� ���� ũ�Ⱑ ����, ����� ���� ũ�⸦ ����, ���� ũ�⸦ ������ �� ����.
	//�÷����� ����ũ�Ⱑ �����̴�
	private static Set<Account> aSet = new HashSet<Account>();
		//�÷����� ���� ���� ���� ��� add(): ���� �������濡 ���� �߰��� ���, index =0 , size()<==�÷����� ����,
		//������ ���� ������ remove() :������
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����.  ��ĳ�ʷ� 1.���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		//�迭 ��ü�� ����. 
		System.out.println("----------------");
		System.out.println("1. ���� ����");
		System.out.println("----------------");
		System.out.println("���� ��ȣ�� �Է� �ϼ���.");
		String ano = scanner.next(); // ���¹�ȣ�� ��ǲ�޾Ƽ� ano������ �Ҵ� <�޼ҵ� �������� ����ϴ� ��������>
		System.out.println("�̸��� �Է� �ϼ���.");
		String owner = scanner.next();
		System.out.println("���� ������ �ʱ� �ݾ��� �Է��ϼ���.");
		int balance = scanner.nextInt();
		
		//���ʵ��� ������ ����ڷ� ���� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����.
		Account account = new Account(ano, owner, balance);//�����ڸ� ���ؼ� ��ü�� �ʵ尪 ������ ��ü����
		aSet.add(account);
		System.out.println("���°� ���������� �����Ǿ����ϴ�.");
		//�迭 ������ �޼ҵ�ܺο��� ����. �������� : ��� �޼ҵ忡�� ��밡��
		
		
		
		
		
		
	}
	private static void accountList() {
		//�ڵ� �ۼ� :2. ���� ��� ��� :  �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ���
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴѰ�� �迭���� ��ü�� ������ �ʵ��� ������ ���
		System.out.println("-----------");
		System.out.println("2.���¸�����");
		System.out.println("-----------");
		
		//�迭�� ������ ���� null�� �ƴ� ���, ��ü�� �ʵ��� ���� ���
		Iterator<Account> iterator = aSet.iterator();
		while (iterator.hasNext()) {
			Account account = iterator.next();			//Next(); ���� �����ְ� ���������� �̵�
			System.out.print(account.getAno());//��������
			System.out.print("    ");
			System.out.print(account.getOwner()); //�̸�
			System.out.print("    "); 
			System.out.print(account.getBalance()); //�ݾ�
			System.out.println(); //���� ����
		}
		System.out.println();
			
		
	}
	private static void deposit() {
		//�ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ� : �ش� ���¿� ����. 
		//1.����ڷκ��� �Ա��� ���¸� �޾ƾߵȴ�.
		//2. ����ڷ� ���� ���� ��ȣ�� �迭�� ����� ��ü���� ���ҹ�ȣ�� Ȯ���� �ش���¿� �Է�
		
		System.out.println("------------");
		System.out.println("3. �����ϱ�");
		System.out.println("------------");
		System.out.println("������ ���� ��ȣ�� �Է��ϼ���.");
		String ano = scanner.next();
		System.out.println("������ �ݾ��� �Է��ϼ���.");
		int money = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano); // findAccount(���¹�ȣ) ȣ��

		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return; //�޼ҵ带 �������� ,����
		}
		account.setBalance(account.getBalance()+money);//setter�� ����ؼ� ������ �ݾ�+ �߰��Ա��ѱݾ�
		System.out.println("��� : ������ ���������� �Ϸ� �Ǿ����ϴ�.");
		
		
		
	}
	private static void withdraw() {
		//�ڵ� �ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���. 
		//1.����ڷκ��� �Ա��� ���¸� �޾ƾߵȴ�.
		//2. ����ڷ� ���� ���� ��ȣ�� �迭�� ����� ��ü���� ���ҹ�ȣ�� Ȯ���� �ش���¿� �Է�
		System.out.println("------------");
		System.out.println("4. ����ϱ�");
		System.out.println("------------");
		System.out.println("����� ���� ��ȣ�� �Է��ϼ���.");
		String ano = scanner.next();
		System.out.println("����� �ݾ��� �Է��ϼ���.");
		int money = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano); // findAccount(���¹�ȣ) ȣ��

		if(account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.");
			return; //�޼ҵ带 �������� ,����
		}
		account.setBalance(account.getBalance()-money);//setter�� ����ؼ� ������ �ݾ� - ����ѱݾ�
		System.out.println("��� : ����� ���������� �Ϸ� �Ǿ����ϴ�.");
		System.out.println("���� �ݾ� : " + account.getBalance());
	} 
	
	//�迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������. 
	//����,����Ҷ� �����ڵ� /���� �޼ҵ忡�� �ߺ� ���ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�.
	private static Account findAccount(String ano) {
		//�ڵ� �ۼ� 
		Iterator<Account> ir = aSet.iterator(); //iterator :��ȸ��,
		 while (ir.hasNext()) {					//hasNext() :hashSet�� ���������ҋ� true,false
		 	Account account = ir.next();			//Next(); ���� �����ְ� ���������� �̵�
		 	String tempid = account.getAno();
		 	
		 	if (tempid.equals(ano)){
		 		return account;
		 	}
		 }
		 	System.out.println("���̵� �������� �ʽ��ϴ�.");
			return null;	
		
	}
	
	
	
	

	public static void main(String[] args) {
		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.println("����>>");
			int selectNo = scanner.nextInt(); 
			
			if (selectNo == 1) {
				createAccount() ; 	//�޼ҵ� ȣ�� , ��ü���� ���� �޼ҵ������ ȣ��(static)
			}else if (selectNo == 2) {
				accountList(); 
			}else if (selectNo == 3) {
				deposit(); 
			}else if (selectNo == 4) {
				withdraw(); 
			}else if (selectNo == 5) {
				run = false; 
				//break; 
			}
			
		}
		scanner.close(); 
		System.out.println("���α׷� ����");
		
	}

}