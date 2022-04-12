package chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//�ܼ� ��ǲ�� �ѱ� ó��		: 1-byte�� ������ �ѱ� ó���� ���� ���Ѵ�. �迭�� �о�� �ѱ� ó���� ����.
// InputStream System.in

public class ConsoleinputObject_3 {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in; //�ѹ��� ������ �� �ִ�. close()���� �������� ���.
		
		System.out.println("�ѱ��� �Է��ϼ��� >>>");
		
		
		//# 2. n-byte �迭 �б� (byte[] ó�� ��ġ���� ���� ������ ����.
		byte[] byteArray1 = new byte[100];
		int count1 = is.read(byteArray1); //	\n\r ����
				//count1 : \n\r�� ���Ե� byteArray1�� ����� ���� ����
		
		//String str1 = new String (byteArray1, 0, count1, Charset.forName("MS949"));
		String str1 = new String (byteArray1, 0, count1, Charset.defaultCharset());
		System.out.println(str1);
		System.out.println("�迭�� ���� �� ���� r �� n ���� : " + count1);
		
		System.out.println("========================"); 
		System.out.println(); 
		
		//3. n-byte ���� �б� ( length ��ŭ �о�ͼ� byte[] �迭�� offset[index] ��ġ�� �����ض�.
		byte[] byteArray2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArray2, offset, length); //6����Ʈ �����ͼ� 3������� ����ִ´�.
		
		String str2 = new String(byteArray2, 0, offset + count2, Charset.defaultCharset());
		//������ 0, offset+count2 �� ����?? 0~ offset+count2 ����?
		System.out.println(str2);
	}

}