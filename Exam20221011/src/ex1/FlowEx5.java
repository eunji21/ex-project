package ex1;

import java.util.Scanner;

/*switch문*/
public class FlowEx5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		String num = sc.nextLine();
		
		switch(num) {
		case 1: //정수만 가능함. 그래서 aaa 는 안됨
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
	
	}//main
} //public

