package ex1;

import java.util.Scanner;

/*150p. 예문*/
public class FlowEx7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위(1),바위(2),보(3) 중 입력 >");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+1; // 0+1 / 1+1 / 2+1
		
		switch(user-com) {
		case 2: case -1: // 바위(2) - 보(3) = -1 
			System.out.println("com 승리");
			break;
		case 1: case -2: // 가위(1) - 보(3) = -2
			System.out.println("user 승리");
			break;
		case 0:
			System.out.println("비김");
		}//switch f
		
		System.out.println("user:"+user+",com"+com);

	}//main
} //public

