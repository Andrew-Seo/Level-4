package Journal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		Server journal = new Server();
		if (args.length > 0) {
			String temp = journal.entry();
			journal.SavetoFile(temp);
		}
	}

	public String entry() {
		String entry = "";
		Scanner kb = new Scanner(System.in);
		while (true) {
			String line = kb.nextLine();
			if (line.contains("~")) {
				
			}
			else if (line.contains("[]")) {
				break;
			}
			else {
				entry = line + "\n";
			}
		}
		return entry;
	}

	public void SavetoFile(String entry) {
		try {
			FileWriter fw = new FileWriter(new File("/Users/league/Desktop/Level-4/src/Journal/Journal.txt"), true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(entry);
			pw.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
