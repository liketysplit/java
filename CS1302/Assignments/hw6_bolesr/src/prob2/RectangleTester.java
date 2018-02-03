package prob2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RectangleTester {

	public static void main(String[] args) {
		readAndWriteRectangles();
	}

	public static File readAndWriteRectangles(){
		File inputFile = new File ("src\\prob2\\rectangles.txt");
		File outputFile = new File ("src\\prob2\\illegalRectangles.txt");
		
		try {
			Scanner input = new Scanner(inputFile);
			PrintWriter writer = new PrintWriter(outputFile);
			while (input.hasNext()){
				double width = input.nextDouble();
				double height = input.nextDouble();
				Rectangle r = new Rectangle(width, height);
				if(r.getE())
				writer.println(r + " ");
				
			}
			input.close();
			writer.close();
		}catch (IOException e){
			System.out.println(e);
		}
		return outputFile;
	}
}