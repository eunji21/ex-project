package ex1;

import java.util.Scanner;

public class FlowEx9_1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=15; i+=2) //1부터; 10까지; 1씩 증가;
					 sum +=i;
		
		
		
		System.out.println("합은"+sum);
	}//main
}
