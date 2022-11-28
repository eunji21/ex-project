package ex1;

import java.util.Scanner;

/*146p ~ 153p.switch문*/
public class FlowEx6 {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
		
		//if ~ else if ~else
//		if(num>=90 && num<=100)
//			System.out.println("학점  A");
//		else if(num>=80)
//				System.out.println("학점  B");
//		else if(num>=70)
//				System.out.println("학점  C");
//		else if(num>=60)
//				System.out.println("학점  D");
//		else
//				System.out.println("학점 F");	
		
		
//		/*switch문 스스로 풀이*/
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		
//		switch(num) { 
//		case 100:
//		case 90: //정수만 가능함. 그래서 aaa 는 안됨
//			System.out.println("학점 A");
//			break;
//		case 80:
//			System.out.println("학점 B");
//			break;
//		case 70:
//			System.out.println("학점 C");
//			break;
//		case 60:
//			System.out.println("학점 D");
//			break;
//		 default:
//			 System.out.println("학점 F");
//		}
		
		
		/*switch문 선생님 풀이*/
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		switch(num/10) { //ex. 99/10 = 9.9 정수만 나오므로 9가 나온다.
		case 10:
		case 9: //정수만 가능함. 그래서 aaa 는 안됨
			System.out.println("학점 A");
			break;
		case 8:
			System.out.println("학점 B");
			break;
		case 7:
			System.out.println("학점 C");
			break;
		case 6:
			System.out.println("학점 D");
			break;
		 default:
			 System.out.println("학점 F");
		}
		
		
		//또다른 풀이
		String str = "0";
		
		switch(num/10) { //ex. 99/10 = 9.9 정수만 나오므로 9가 나온다.
		case 10:
		case 9: //정수만 가능함. 그래서 aaa 는 안됨
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;
		case 6:
			str = "D";
			break;
		 default:
			 str = "F";
		}
		System.out.println("입니다.");
	
	}//main
} //public

