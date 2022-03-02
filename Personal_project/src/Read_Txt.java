import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read_Txt {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\wnsvy\\Desktop\\programming\\java1\\Personal_project\\bible.txt");

		// 입력을 받는데 사용하는 클래스
		Scanner scanner = new Scanner(System.in); 
		
		// txt 파일을 읽는데 사용할 클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"EUC_KR"));

		String line = null;
		while ((line = br.readLine()) != null) {
			String name = "출";
			int chapter = 1;
			String s_chap = Integer.toString(chapter);
			
			while (line.substring(0,name.length()+s_chap.length()).equals(name+Integer.toString(chapter))==false)
			{
				line = br.readLine();}
			
	        System.out.printf(line.substring(name.length()+s_chap.length()+3) + "%n");
	        String inputTxt = scanner.nextLine();
			
	        // 입력값이 맞았는지 확인
	        while (line.substring(5).equals(inputTxt) == false) {
	        	System.out.println("틀렸습니다.");
	        	System.out.printf(line.substring(name.length()+s_chap.length()+3) + "%n");
	        	inputTxt = scanner.nextLine();
	        	continue;
	        }
	    }
		
	}

}
