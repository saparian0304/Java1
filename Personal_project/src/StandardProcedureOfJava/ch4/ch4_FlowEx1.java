package StandardProcedureOfJava.ch4;

public class ch4_FlowEx1 {

	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은 %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d일 때, 참인 것은 %n", x);
		if(x==0) System.out.println("x==0");
		if(x!=0) System.out.println("x!=0");
		if(!(x==0)) System.out.println("!(x==0)");
		if(!(x!=0)) System.out.println("!(x!=0)");

	}
}

// if (조건식) {} : 조건식의 결과는 항상 true 아니면 false여야 한다.
// 조건식이 true이면 {} 안의 문장들을 수행하라
// 조건식이 false이면 {} 안의 문장은 건너뛰어진다.