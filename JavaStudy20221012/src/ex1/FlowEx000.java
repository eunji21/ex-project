package ex1;

import java.util.Scanner;

/*
 * 정수 3개를 입력 받아서,, 최대값과 최소값을 구하는 프로그램 작성
 */

public class FlowEx000 {

	public static void main(String[] args) {	
		
		
//		// 정수 3개를 입력 받아서 큰 수, 중간 수, 작은 수를 구분한다.
//		Scanner sc = new Scanner(System.in);
//		  int a, b, c;
//		  int max = 0, min = 0;
//		  
//		  out.print("정수 3개 입력 >>> ");
//		  a = sc.nextInt();
//		  b = sc.nextInt();
//		  c = sc.nextInt();
//		    
//		  max = (a > b) ? a : b;
//		  max = (max > c) ? max : c;
//		  
//		  min = (a < b) ? a : b;
//		  min = (min < c) ? min : c;
//		  
//		  if(a == max){
//		   min = (b > c) ? b : c;
//		  }else if(b == max){
//		   min = (a > c) ? a : c;
//		  }else if(c == max){
//		   min = (a > b) ? a : b;
//		  }
//		   
//		  out.printf("최댓값은%d 중간값은%d 최솟값은%d\n", max, mid, min);
		  
		 /*선생님풀이*/
		Scanner sc = new Scanner(System.in);
		
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		int in3 = sc.nextInt();
		int max = 0, min = 0;
		
		
		System.out.println(in1+","+ in2 + ","+in3);
		
		if(in1 > in2 && in1 > in3) {
			max=in1;
			if(in2>in3)min = in3;
			min = (in2>in3) ? in3:in2;
			
		}else if(in2 >in1 && in2>in3) {
			max = in2;
			min = (in1>in3) ? in3:in1;
		}else if(in3 >in1 && in3>in2) {
			max = in3;
			min = (in1>in2) ? in2:in1;
		}
		
		
		System.out.println("최대값: "+max +",최소값: "+min);
		
		
		
		 } //main
	}


