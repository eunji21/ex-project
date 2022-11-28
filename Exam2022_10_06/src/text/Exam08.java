package text;


import java.util.Scanner;


public class Exam08 {
 

	public static void main(String[] args) { //main 선언

		/*비트 연산자 121.p*/
		int a = 15; //1111
		int b = 10; //1010 + =1111 =>15
		
		System.out.println(a | b); //or! a나 b 중 한쪽 값이 1이면 1을 결과롤 얻는다. 그외엔 0
		System.out.println(a & b); //and! 양 족 모두 1이여야만 1을 결과로 얻는다. 그외엔 0
		System.out.println(a ^ b); // a와 b 값이 다를 때만 1을 결과로 얻는다.
		System.out.println(a & ~b); // 물결은 반전시키겠다는 뜻.
		
	}
	
}
