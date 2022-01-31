import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read_Txt {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\wnsvy\\Desktop\\programming\\Personal_project\\Joshua_1.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));

		String line = null;

		while ((line = br.readLine()) != null) {
	        System.out.println(line);
	    }
		

	}

}
