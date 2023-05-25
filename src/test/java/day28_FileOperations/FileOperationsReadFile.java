package day28_FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileOperationsReadFile {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\vidhy\\eclipse\\JavaTraining\\src\\test\\resources\\File1.txt");
		
		try {
			FileReader fr = new FileReader(f);
			Scanner sc = new Scanner(f);
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
