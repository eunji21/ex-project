package ex1;

/*162p 중첩 for문*/
public class FlowEx16_2 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5-i; j++)
			System.out.print("* ");
			System.out.println();
		}
		
		
		//다른 예제
		for(int i=0; i<6; i++) {
			for(int j=5; j>0; j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("* ");
			}	
			System.out.println();
			
		}

		
		
		
		
		
		
		
		
		
	} //main
}
