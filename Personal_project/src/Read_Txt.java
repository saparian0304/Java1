import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read_Txt {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\wnsvy\\Desktop\\programming\\java1\\Personal_project\\bible.txt");

		// �Է��� �޴µ� ����ϴ� Ŭ����
		Scanner scanner = new Scanner(System.in); 
		
		// txt ������ �дµ� ����� Ŭ����
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"EUC_KR"));

		String line = null;
		while ((line = br.readLine()) != null) {
			
	        System.out.printf(line.substring(5) + "%n");
	        String inputTxt = scanner.nextLine();
			
	        // �Է°��� �¾Ҵ��� Ȯ��
	        while (line.substring(5).equals(inputTxt) == false) {
	        	System.out.println("Ʋ�Ƚ��ϴ�.");
	        	System.out.println(line);
	        	inputTxt = scanner.nextLine();
	        	continue;
	        }
	    }
		
	}

}
