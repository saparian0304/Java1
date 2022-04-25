package StandardProcedureOfJava.ch4;

public class ch4_FlowEx19 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) 
			for(int j=1;j<=3;j++)
				for(int k=1;k<=3;k++)
					System.out.println(""+i+j+k);
	}	// main의 끝
}

/* 앞에서부터 연산이 되기때문에 String 형식으로 변환된다.
 * ""+i+j+j = "i"+j+k	
 * 			= "ij"+k
 * 			= "ijk"
 */