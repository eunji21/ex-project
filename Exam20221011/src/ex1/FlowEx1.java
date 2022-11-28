package ex1;

public class FlowEx1 {

	public static void main(String[] args) {
		/*137p 예*/
		int x = 0;
		
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0"); //true
		if(x!=0) System.out.println("x!=0"); //false
		if(!(x==0)) System.out.println("!(x==0)"); // 앞 !는 부정형으로 바뀜 false
		if(!(x!=0)) System.out.println("!(x!=0)"); // 부정+부정= true
		System.out.println();
		
		x=1;
		
		System.out.printf("x=%d일 때, 참인 것은%n", x); //%n은 줄바꿈!
		
		if(x==0) System.out.println("x==0"); // false
		if(x!=0) System.out.println("x!=0"); // true
		if(!(x==0)) System.out.println("!(x==0)"); //true
		if(!(x!=0)) System.out.println("!(x!=0)"); // false

	}

}
