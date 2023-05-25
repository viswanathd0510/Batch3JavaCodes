package day28_FileOperations;

import java.io.File;
import java.io.IOException;

public class FileOperationsCreatingFile {

	public static void main(String[] args) {

		// File is a class inbuild in java and we have to overload the file path

		File f = new File("C:\\Users\\vidhy\\eclipse\\JavaTraining\\src\\test\\resources\\File1.txt");
		
		// Inbuild Methods 
		
		// To create a file 
		
		try {
			if(f.createNewFile())
			{
				System.out.println("File Created");
			}
			else 
			{
				System.out.println("File already exits");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
	}

}
