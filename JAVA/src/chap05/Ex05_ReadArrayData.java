package chap05;

import java.util.Arrays;

public class Ex05_ReadArrayData {

	public static void main(String[] args) {

		int[] array = new int[] {3,4,5,6,7};
		
		// 1. �迭�� ��(index)�� ���� ���ϱ�
		System.out.println(array.length); // ���� ������ ��� : 5
		
		//2. ����ϱ� 1 : ���ȣ�� ���� �� ��� : Ư�� ���� ���� ������ ��
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		//System.out.print(array[5]+" "); // ArrayIndexOutOfBoundsException, ���ȣ�� �ʰ��� ��츦 ��½� ���� �߻�
		System.out.println();
		
		//3. ����ϱ� 2 : for ���� ����ؼ� Ư�� ������ �����ؼ� ���
		for (int i=0; i< array.length; i++) { //****array.length****
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		// for ���� ����ؼ� Ư�������� ����ϱ�
		for (int i= 1; i<3; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		
		//4. ����ϱ� 3 : ���� for��, ó�� ����� ������ ����� ��ȯ�ϸ鼭 ���, ����?Ư¡: ������ �����ؼ� ����Ҽ� ����.
			// ������ for���� ���ؼ� ª��. 
		
		for ( int k : array) { //for ( ������ڷ��� ���� : �迭����) { ���౸��, k�� ��� }
			System.out.print(k + " ");
		} //���� for�� ������ ù����� ����������� ���
		
		System.out.println();
		//5. ����ϱ� 4 : Arrays.toString(�迭������) �迭�������� ��簪 ���
		
		System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}