package chap05;

public class Ex2_04_ArgumentOfMainMethod_02 {

	public static void main(String[] args) {

		//main method�� ��ǲ �Ű� ������ ������ �迭�� ���̸� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		//�Է� �Ű� ������ for ������ ���
		
		for ( int i = 0; i< args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("=====================");
		
		
		//�Է� �Ű� ������ ���� (enhanced) for ������ ���
		for (String k : args) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}