package chap06_07.Ex02;

import java.util.Scanner;

public class Q2 {

	static void math (String...values) {
		int sum = 0; //���� �������� ���ϴ� ����
		double avg;  //��հ��� �����ϴ� ����
		
		for (int i=0;i < values.length; i++) {
		//	sum = sum + values[i]; //value[i]���� ���� ���� String Ÿ���̹Ƿ� ����Ÿ������ ��ȯ�ʿ�
			//sum = sum + Integer.parseInt(values[i]);
				//Integer.parseInt(String) : ������ String  Ÿ���� ������ ��ȯ
			sum += Integer.parseInt(values[i]);
		}
		avg = (double) sum/ values.length; //����� ����ȯ�� �ݵ�� �ʿ�
		System.out.println();
		System.out.println("���Ƿ� ���� ���� �հ�� : " + sum);
		System.out.println("���Ƿ� ���� ���� ����� : " + avg);
		
	}
	
	public static void main(String[] args) {
		//��ĳ�ʷ� ������ ���� ���� �Ҵ� �޾Ƽ� �հԿ� ����� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ������ �־ �Է��ϼ���.>>");
		
		String num = sc.nextLine();  //������ ���� ������ ��ü �������� String
		String[] array1 = num.split(" "); //split�� �����ڸ� �������� ���ڸ� �߶� �迭�� ����
		
		System.out.println();
		System.out.println("����� �Է��� ������ : ");
		for ( int i = 0; i<array1.length; i++) { //�Է� �Ǵ� ������ ���
			System.out.print(array1[i]+ " " );
		}
		math(array1); //���� ���� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� array1�� �־� �ָ� �ȴ�.		
		
		
	}

}