package text;


import java.util.Scanner;

/*문제.....사칙연산자 97p
 * 키보드로 4000을 입력 받는다. (4000초)
 * 사칙연산을 이용해서 시 분 초로 변경
 * 1시 6분 40초
  */
public class Exam06 {
 

	public static void main(String[] args) { //main 선언
	
		
//		int a = 1000000;
//		int result1 = (int)((long)a*a / a);
//		//int * int ==> int
//		//long * int ==> long * long > long
//		System.out.println(result1);
		
		
//		byte a =10;
//		byte b =30;
//		byte c =(byte)(a*b);
//		System.out.println(c);
//		
		
		
		
//		char a = 'a';
//		char d = 'd';
//		char zero = '0';
//		char two = '2';
//		
//		System.out.printf("%c", a+2);
//		System.out.println();
//		System.out.println(Math.round(1225.65));

		
		/*비교 연산자 109.p*/
		int a =5;
		int b =2;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String str1 = "korea";
		String str2 = "korea";
		// = 부등호는 주소의 위치가 맞는지 확인
		String str3 = new String("korea");
		System.out.println("------"); 
		System.out.println(str1==str2);// korea 처럼 같은 주소라면 true 
		System.out.println(str1==str3);// 주소와 문자 false
		
		/*112p 문자열 비교*/
		System.out.println("------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		// 문자를 비교할 땐 부등호 말고 .equals를 사용하자 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
