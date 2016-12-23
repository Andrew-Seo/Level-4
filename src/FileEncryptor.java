import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEncryptor {

	public static File openSecretFile() {
		File file = new File("./src/newfile.txt");
		return file;
	}

	public static String readOneLine(File file) {
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(file.toString()))) {
			line = br.readLine();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public static String readFileContents(File file) {
		String line = null;
		StringBuffer fileContents = new StringBuffer();
		try (BufferedReader br = new BufferedReader(new FileReader(file.toString()))) {
			while ((line = br.readLine()) != null) {
				fileContents.append(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileContents.toString();
	}

	public static String encrypt(String encryptMe) {
		StringBuffer encryptor = new StringBuffer();
		byte[] bytes = encryptMe.getBytes();
		// encryptMe.codePoints().forEach(i ->
		// encryptor.append(encryptChar(i)));
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
			if (Character.isAlphabetic(bytes[i])) {
				bytes[i] = (byte) (((bytes[i] -'a' + 2) % 26) + 'a');
			}
			System.out.println(bytes[i]);
		}
		System.out.println(encryptMe);
		return new String(bytes);
	}

	private static char[] encryptChar(int b) {
		if (Character.isAlphabetic(b)) {
			b = ((b + 2) % 26);
		}
		return Character.toChars(b);
	}

}
// Copyright AndrewSeo Inc. 2016
