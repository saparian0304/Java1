package StandardProcedureOfJava.ch5;

public class ch5_ArrayEx10 {
	// 버블정렬(bubble sort)
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i=0; i < numArr.length; i++)  {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for (int i=0; i < numArr.length-1; i++) {
			boolean changed = false;
			
			for (int j=0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
				}
			} // end for j
			
			if (!changed) break;	// 자리바꿈이 없으면 반복문을 벋어난다.
			// 자리바꿈이 일어나면 changed = true,  !changed = false,  if (false) 이므로 if문을 건너뜀
			// 자리바꿈이 없으면 changed=false, !changed=true, if(true)이므로 break문 실행
			
			for(int k=0; k<numArr.length; k++) 
				System.out.print(numArr[k]);
			System.out.println();
		} 	// end of i
	}	// main의 끝
}
