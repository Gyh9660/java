package chap05;

public class Ex02_ValueAssignment_ {

	public static void main(String[] args) {

		//1. �迭 ������ �濡 �� �Ҵ� �ϱ�(3����)
		int[] array1 = new int[3]; // �迭����: array1, ��ũ�� 3, ���ȣ �Ҵ� : index(���ȣ): 0,1,2
		//array1[0] , array1[1], array1[2]
		
		//�迭�� �� �濡 ���� �Ҵ�
		array1[0] =3;
		array1[1] =4;
		array1[2] =5;
		
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		int [] array2;
		array2 = new int[3];
		array2[0] =3;
		array2[1] =4;
		array2[2] =5;
		
		//�迭�� ���Ұ��� ���� ��� 2
		
				int[] array3 = new int[] {6,7,8,9,10}; //�迭 ���� ����� ���ÿ� ���Ҵ�, �迭�� ���� �ʱⰪ�� �˶�
				System.out.println(array3[0]+" "+array3[1]+ " "+array3[2]+" "+array3[3]+ " "+array3[4]);
				
				System.out.println("==================");
				
				int[] array4 ;
				array4 =new int[] {3,4,5};
				System.out.println(array4[2]); //index : 2���� ���� ���
				
				System.out.println("==================");
				
				//�迭�� ���� ���� �����ϴ� ���3
				int[] array5 = {11,12,13};
				System.out.println(array5[0]+" "+ array5[1]+" "+array5[2]);
				
				/*<<<���� �߻�>>>
				 * int[] array6;
				 * array6 = {11,12,13};
				 * 
				System.out.println(array6[0]+" "+array6[1]+ " "+array[2]);
				 * 
				 */	
	}

}