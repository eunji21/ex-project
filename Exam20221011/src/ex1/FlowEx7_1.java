package ex1;

import java.util.Scanner;

/*로또 문제
 * 1~45까지 있음* */
public class FlowEx7_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	   for(int i=0; i<6; i++) { //반복문 for는 회전 횟수를 알때, while 회전 횟수를 모를 때 주로 사용.
		int com = (int)(Math.random()*45)+1; //0 ~44
		
		System.out.print(com+".");
	     }
	   
	   /*만약 반복문을 쓰지 않는다면*/
//		int com1 = (int)(Math.random()*45)+1;
//		System.out.print(com+".");
//		int com2 = (int)(Math.random()*45)+1;
//		System.out.print(com+".");
//		int com3 = (int)(Math.random()*45)+1;
//		System.out.print(com+".");
//		int com4 = (int)(Math.random()*45)+1;
//		System.out.print(com+".");
//		int com5 = (int)(Math.random()*45)+1;
//		System.out.print(com+".");
	   
	}//main
} //public

