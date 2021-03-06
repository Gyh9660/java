package chap04;

public class Ex03_For {

	public static void main(String[] args) {

		//For 기본 작동
		
		int a; // 전역 변수 . 블락 밖에서 선언된 변수, 선언(0), 초기값 (x)
		for ( a = 0; a < 5 ; a++) {
			System.out.print(a+" "); //
		}

		System.out.println( );
		System.out.println("블락 밖에서 출력 : " + a);
		System.out.println("=================");
		
		for (int b=0; b<=10; b++) {
			System.out.println(b);
		}
		//System.out.println(b); //지역 변수라 for문 내에서만 유효함.
		System.out.println("===============");
		int c;
		for ( c=10; c>0; c--) {
			System.out.println(c);
		}
		
		System.out.println("==================");
		//2의 배수 출력 ( i+=2 ==> i= i+2)
		for (int i=0; i<100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("==================");
		/* for문 내에서 초기값과 증가값은 여러 변수를 할당 할 수 있다.
		 * 
		 */
		
		for (int i=0, j=0; i<10; i++ , j++) {
			System.out.println(i +"*" +j+":"+(i * j)+"  " );
		}
		System.out.println("==================");
		
		// * for문을 사용해서 1부터 100까지 *값을 출력해 보세요.
		int s=1;
		for (int i=1; i<=10; i++) {
			s*=i; //s= s*i
		}
		System.out.println(s);
		// for 문을 사용해서 1부터 100까지 더한 값을 출력
		
		int sum =0;
		for (int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		int o = 0;
		for (int i=0; i<=100; i+=2) {
			o+=i;
		}
		System.out.println(o);
		System.out.println("=======구구단 출력============");
		/* 이중 for 문 : 1단부터 시작해서 9단까지 구구단 출력
		 * 
		 */
		
		for ( int i = 1; i<=9; i++) { // i: 단을 출력
			for ( int j = 1; j<=9; j++) {
				System.out.println( i + " * " + j + " = "  + (i * j));
			}
		System.out.println("=====================");
			}
		
		//for문에서 무한루프 발생, 조건이 없을 경우
		/*for ( int i = 0;; i++) {
		*	System.out.print(i + " "); // 0, 1 , 2......
		}
		*/
		
		/*for (;;) {
			System.out.println("무한 루프");
		}
		*/
		
		System.out.println("======================");
		
		//무한 루프 탈출
		
		for ( int i = 0; ; i++ ) {
			
			if ( i > 100) {
				break;   // break를 걸어주면 무한루프를 강제로 벗어남
			}
			System.out.println(i);
		}
		
		/* for 문을 사용해서  1부터 1000까지 4의 배수만 더한값/ 평균값 double형식*/
		
		int num = 0;
		for (int i=0; i<=1000; i+=4) {
			num+=i;
		}
		double y = 1000/4;
		System.out.println(num);
		double avg = (num/y);
		System.out.println(avg);
		System.out.println("1부터 1000까지 4의 배수의합 :"  + num +" " + "평균 :" +  avg );
		
		double sum1 =0; //더한 값을 저장하는 변수
		int j =0; //4의 배수를 카운트 하는 변수
		for ( int i = 1; i<=1000; i++) {
			if ( i % 4 == 0 ) {
				sum1 += i; // sum = sum + i 4의 배수만 더함
				j++;
			}
		}
		System.out.println("합은 :" + sum1 );
		System.out.println("평균 :" + (sum1/j));
		
		
	}

}
