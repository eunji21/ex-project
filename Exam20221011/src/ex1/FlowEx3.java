package ex1;

import java.util.Scanner;
/*사친연산 프로그램
 * 1: +, 2: -, 3:*, 4:/
 * 정수 2개 입력, 사칙연산 기호 입력 => 3개 입력
 * 10,20,4	10/20=0.5
 * 10,20,1	10+20=30
 * 10,20,3	10*20=200
 * */
public class FlowEx3 {
	
	public static void main(String[] args) {
		
		/*언니 도움 ,인터넷 보고 한 풀이*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫 번째 숫자를 입력하시오 : ");
//		int num = sc.nextInt();		
//		System.out.println("두 번째 숫자를 입력하시오 : ");
//		int num2 = sc.nextInt();
//		System.out.println("사칙연산부호 1: +, 2: -, 3:*, 4:/ : ");
//		int sign = sc.nextInt();
//
//		
//
//		if(sign==1)
//			System.out.println(num + num2);
//		else if(sign==2)
//			System.out.println(num - num2);
//		else if(sign==3)
//			System.out.println(num * num2);
//		else if(sign==4)
//			System.out.println(num / num2);
//		else
//			System.out.println("잘못 입력하셨습니다.");
//		
//		
//		
//		//또 다른 풀이
//		int x = 0;
//			
//		if(sign==1) {
//			x= num + num2;
//		}
//		else if(sign==2) {
//			x = num - num2;
//		}
//		else if(sign==3) {
//			x = num * num2;
//		}
//		else if(sign==4) {
//			x = num / num2;
//		}
//			System.out.println(x);
		
		
		/*선생님 풀이*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개 입력: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("연산기호: +:1,-:2,*:3,/:4");
		int sign = sc.nextInt();
		
		if(sign==1)
			System.out.println(num1+num2);
		else if(sign==2)
			System.out.println(num1-num2);
		else if(sign==3)
			System.out.println(num1*num2);
		else if(sign==4)
			System.out.println((double)num1/num2); //실수
		
		
		
	}//main
} //public
