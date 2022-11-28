package ex1;

import java.util.Scanner;
/*사친연산 프로그램
 * 1: +, 2: -, 3:*, 4:/
 * 정수 2개 입력, 사칙연산 기호 입력 => 3개 입력
 * 10,20,4	10/20=0.5
 * 10,20,1	10+20=30
 * 10,20,3	10*20=200
 * 
 * <조건문에는 if문, switch문이 있다!>
 *
 * if(참) 1문장실행
 * if(참){
 * 문장1;
 * 문장;
 * }
 * 
 * if(참) 참 문장 실행
 * else 거짓 문장 실행
 * 
 * if(조건1참) 문장1
 * else if(조건2 참)문장2
 * else if(조건3 참)문장3
 * ..
 * else 문장
 * */
public class FlowEx4 {
	
	public static void main(String[] args) {
		
		/*선생님 풀이*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개 입력: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("연산기호(+,-,*,/)중 하나 입력:");
		sc.nextLine();
		String sign = sc.nextLine(); //문자열엔 꼭 String 쓰기
		
		if(sign.equals("+"))
			System.out.println(num1+num2);
		if(sign.equals("-"))
			System.out.println(num1-num2);
		if(sign.equals("*"))
			System.out.println(num1*num2);
		if(sign.equals("/"))
			System.out.println((double)num1/num2);

		
		
		
		
		
		
	
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1번 입력");
			break;
		case 2:
			System.out.println("2번 입력");
			break;
		case 3:
			System.out.println("3번 입력");
			break;
		case 4:
			System.out.println("4번 입력");
			break;
		 default:
			 System.out.println("1~4외 입력");
		} //switch f
		
		System.out.println("1~4외 입력");
		
		
	}//main
} //public