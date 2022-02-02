import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read_Txt {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\wnsvy\\Desktop\\programming\\java1\\Personal_project\\Joshua_1.txt");

		// 입력을 받는데 사용하는 클래스
		Scanner scanner = new Scanner(System.in); 
		
		// txt 파일을 읽는데 사용할 클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));

		String line = null;
		while ((line = br.readLine()) != null) {
	        System.out.printf(line + "%n");
			scanner.nextLine();
	    }
		

	}

}
