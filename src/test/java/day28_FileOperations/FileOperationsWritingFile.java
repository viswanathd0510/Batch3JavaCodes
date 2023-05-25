package day28_FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationsWritingFile {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\vidhy\\eclipse\\JavaTraining\\src\\test\\resources\\File1.txt");
		
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("This is the first piece of code in File Handling");
			fw.close();
		} catch (IOException e) {
			
		}

	}

}
