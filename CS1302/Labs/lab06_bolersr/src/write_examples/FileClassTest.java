package write_examples;

import java.io.File;
import java.io.IOException;

public class FileClassTest {

	public static void main(String[] args) throws IOException {
		File inFile = new File( "src\\write_examples\\number.txt" );
		
		System.out.println("File exists   : " + inFile.exists());
		System.out.println("File size     : " + inFile.length() + " bytes");
		System.out.println("Can be read   : " + inFile.canRead());
		System.out.println("Can be written: " + inFile.canWrite());
		System.out.println("Is a directory: " + inFile.isDirectory());
		System.out.println("Is a file     : " + inFile.isFile());
		System.out.println("Is hidden     : " + inFile.isHidden());
		System.out.println("Absolute path : " + inFile.getAbsolutePath());
		System.out.println("Path          : " + inFile.getPath());
		System.out.println("Parent        : " + inFile.getParent());
		System.out.println("Name          : " + inFile.getName());
		// Must compute the "true" path
		String absPath = inFile.getAbsolutePath();
		int begOfFileName = absPath.lastIndexOf(inFile.getName());
		String truePath = absPath.substring(0,begOfFileName);
		System.out.println("True path     : " + truePath);

		System.out.println("Last modified : " + new java.util.Date(inFile.lastModified()));
	}
}
