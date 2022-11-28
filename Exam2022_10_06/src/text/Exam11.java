package text;


import java.util.Scanner;

/* 136p
 * 1. 조건 연산자(if문)
 * 2. if문, if ~else, 
 * 3. if~elseif~elseif~ else
 **/
public class Exam11 {
 

	public static void main(String[] args) { //main 선언
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = sc.nextInt();
		
		/*조건이 참이면 실행 아니면 놉 예시 -5*/
//		if(num>0) //false
//			System.out.println("양수");
//		
//		if(num==0) //false
//			System.out.println("zero");
//		
//		if(num>0) //true
//			System.out.println("음수");
		
		
		
//		if(num>0) //false
//			System.out.println("양수");
//		
//		else if(num==0) //false
//			System.out.println("zero");
//		
//		else if(num>0) //true
//			System.out.println("음수");
		
		
		if(num>90)
			System.out.println("A");
		
		else if(num>80)
			System.out.println("B");
		
		else if(num>70) 
			System.out.println("C");
		
		else if(num>60) 
			System.out.println("D");
		
		else if(num>50) 
			System.out.println("F");
		
		
		
		
		
		
		
		
	}
	
}
