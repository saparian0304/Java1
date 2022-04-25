import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read_Txt {

	public static void main(String[] args) throws IOException {
		// 입력을 받는데 사용하는 클래스
		Scanner scanner = new Scanner(System.in); 
		
		System.out.printf("읽을 성경책의 약자를 입력하세요 : ");
		String name = scanner.nextLine();
		
		System.out.printf("원하는 장을 입력하세요 : ");
		int chapter = Integer.parseInt(scanner.nextLine());
		
		int verse = 1;
		
		String pathBible = "./bible/%s_en.txt";
		
		File file = new File("./bible.txt");
		File file_en = new File(String.format(pathBible, name));
		
		// txt 파일을 읽는데 사용할 클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"EUC_KR"));
		BufferedReader br_en = new BufferedReader(new InputStreamReader(new FileInputStream(file_en),"EUC_KR"));
		
		
		String line = null;
		String line_en = null;
		while ((line = br.readLine()) != null && (line_en = br_en.readLine()) != null) {

			
			String s_chap = Integer.toString(chapter);
			String s_verse = Integer.toString(verse);
			
			while (line.substring(0,name.length()+s_chap.length()).equals(name+Integer.toString(chapter))==false)
			{
				line = br.readLine();
				}			
			while (line_en.substring(0,s_chap.length()).equals(Integer.toString(chapter))==false)
			{
				line_en = br_en.readLine();
				}
			
	        System.out.printf(line.substring(name.length()+s_chap.length()+ s_verse.length() + 2) + "%n");
	        System.out.printf(line_en.substring(s_chap.length()+ s_verse.length() + 2) + "%n");
	        String inputTxt = scanner.nextLine();
			
	        // 입력값이 맞았는지 확인
	        while (line_en.substring(s_chap.length()+ s_verse.length() + 2).equals(inputTxt) == false) {
	        	System.out.println("틀렸습니다.");
	        	System.out.printf(line.substring(name.length()+s_chap.length()+s_verse.length() + 2) + "%n");
	        	System.out.printf(line_en.substring(s_chap.length()+ s_verse.length() + 2) + "%n");
	        	inputTxt = scanner.nextLine();
	        	continue;
	        }
	        verse = verse + 1;
	        
	    }
		br.close();
		br_en.close();
		scanner.close();
		
	}

}
