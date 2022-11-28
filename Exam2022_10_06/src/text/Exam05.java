package text;


import java.util.Scanner;

/*문제.....사칙연산자 97p
 * 키보드로 4000을 입력 받는다. (4000초)
 * 사칙연산을 이용해서 시 분 초로 변경
 * 1시 6분 40초
  */
public class Exam05 {
 

	public static void main(String[] args) { //main 선언
		
		/* 인터넷 검색 혼자한 것
		Scanner sc = new Scanner(System.in);
		//Scanner 클래스 변수 선언 및 초기화. 입력값을 받아오는 스캐너기능을 사용할 수 있다
		
		System.out.print("정수를 입력하세요 : ");
		int time = sc.nextInt();  //Scanner기능 변수 값을 입력받아 정수형 변수 time에 대입
		int hour = (time / 60) / 60;  //입력받아 대입된 time 값으로 시간단위 계산
		int minute = (time / 60) % 60;  //입력받아 대입된 time 값으로 분단위 계산
		int second = time % 60;  //입력받아 대입된 time 값으로 초단위 계산
		
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초입니다");
		scanner.close();
		*/
		
		
		
		/*선생님 풀이
		Scanner sc= new Scanner(System.in);
		
		int time = sc.nextInt();
		// Scanner 클래스 변수 선언 및 초기화. 입력값을 받아오는 스캐너 기능을 사용할 수 있다.
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		second = time%60; //초
		minute = time/60;
		hour = minute/60; //시간
		minute = minute%60; //분
		
		System.out.println("time" + time);
		System.out.println(time+"초는 "+hour+"시간 "+minute+"분 "+second+"초입니다");
		//4000초는 1시간 6분 40초 입니다.
		 */
		
		
		
		

		
		
	
		
		
		
	}
	
}
