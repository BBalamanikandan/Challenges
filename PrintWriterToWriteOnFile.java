package javapractise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterToWriteOnFile {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw=new PrintWriter(new File("\\sample.txt"));
			pw.write("Hey, there?");
			pw.flush();
			pw.close();
			System.out.println("sample.txt file created at runtime and Hey, there? written successfully\nPlease check your storage where this workspace created");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
