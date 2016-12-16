import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptor {

	static FileReader fr = null;
	static BufferedReader br = null;

	public static File openSecretFile() {
		File file = new File("./src/newfile.txt");
		return file;
	}

	public static String readOneLine(File file) {
		if (br == null) {
			try {
				fr = new FileReader(file.toString());
				br = new BufferedReader(fr);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		}
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String readFileContents(File file) {
		// TODO Auto-generated method stub
		if (br == null) {
			try {
				fr = new FileReader(file.toString());
				br = new BufferedReader(fr);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		}
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
//Copyright AndrewSeo Inc. 2016
