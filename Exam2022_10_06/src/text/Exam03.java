package text;

public class Exam03 {
 
	public static void main(String[] args) {
	
		int num=10;
		int num2;
		int num3;
		
		// num = num +1
		// num+=1;
		num2=num++; // num 10을 복사 후 ++를 만나 1 증가함
		num3=++num; // 12
//		num++; // 11 증감연산자(후위형)
//		++num; // 12 증감연산자(전위형)
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		
		
		int age = 5;
		int n1;
		int n2;
		
		n1=++age; // 6
		n2=age++; // 6
		
		System.out.println(age + " "+n1+" "+n2);
		//7 6 6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
