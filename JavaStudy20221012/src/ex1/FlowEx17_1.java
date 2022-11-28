package ex1;

public class FlowEx17_1 {

	public static void main(String[] args) {
		
		//for문 구구단
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++)
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//	
		//while문
//		int i =2;
//		while(i<=3){
//			int j=1;
//			while(j<=5) {
//				System.out.println(i+"*"+j+"="+i*j);
//			j++;
//		}
//		i++;
//		System.out.println();
//		}
		
		
		/*flag 사용*/
		boolean flag = true;
		
		
		int k = 0; 
		while(flag){
			
			System.out.println("-------------");
			if(k++>10)
				flag = false;
		}
		
		
		
		
		
		
		
		
	}//main
}
