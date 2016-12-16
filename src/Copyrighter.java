import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Copyrighter {
	public static void main(String[] args) {
		try (Stream<Path> paths = Files.walk(Paths.get("./src"))) {
			paths.forEach(filePath -> {
				if (Files.isRegularFile(filePath) && filePath.toFile().getName().endsWith(".java")) {
					if (!isCopyrighted(filePath)) {
						addCopyright(filePath);
						System.out.println("addCopyrighted()");
					}
				}
			});

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static boolean isCopyrighted(Path filePath) {
		String lastLine = "";
		try (FileReader fr = new FileReader(filePath.toString()); BufferedReader br = new BufferedReader(fr)) {
			String currentLine = "";
			while((currentLine = br.readLine()) != null){
				lastLine = currentLine;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (lastLine.startsWith("//Copyright AndrewSeo Inc.")) ;
	}

	private static void addCopyright(Path filePath) {
		try (FileWriter fw = new FileWriter(filePath.toString(), true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println("//Copyright AndrewSeo Inc. 2016");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
//Copyright AndrewSeo Inc. 2016
