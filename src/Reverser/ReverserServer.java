package Reverser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReverserServer {
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		StringBuilder sting = new StringBuilder(kb.nextLine());
		sting.reverse();
		String temp = sting.toString();
		System.out.println(temp);
	
	
	try {
		FileWriter fw = new FileWriter(new File("/Users/league/Desktop/Level-4/src/newfile.txt") , true);
		PrintWriter pw = new PrintWriter(fw);
		pw.print(temp);
		pw.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
