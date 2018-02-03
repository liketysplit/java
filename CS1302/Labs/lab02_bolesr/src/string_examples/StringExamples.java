package string_examples;
import java.util.Scanner;
public class StringExamples {

	public static void main(String[] args) {
//		testSplitSentences();
//		testSplitWords();
//		testStringFormat();
//		testStringBuilder();
		testStringBuilderEfficiency();
	}

	public static void testSplitSentences() {
		System.out.println("testSplitSentences()");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a few sentences with common punctuation");
		String text = keyboard.nextLine();

		int count = 1;
		String[] sentences = text.split("\\.\\s*|\\!\\s*|\\?\\s*");
		for(String sentence : sentences) {
			System.out.println("Sentence " + (count++) + ":\"" + sentence + "\"" );
		}
		System.out.println();
		keyboard.close();
	}

	public static void testSplitWords() {
		System.out.println("testSplitWords()");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a few sentences with common punctuation");
		String text = keyboard.nextLine();

		String[] words = text.split("\\s+|\\,\\s*|\\;\\s*|\\:\\s*|\\.\\s*|\\!\\s*|\\?\\s*");
		System.out.print("Words:");
		for(String word : words) {
			System.out.print("\"" + word + "\", " );
		}
		System.out.println();
		keyboard.close();
	}

	public static void testStringFormat(){
		System.out.println("testStringFormat()");

		double y = 32914.4380239;
		String msg = String.format("y = %.2f", y);
		System.out.println(msg);
		
		int z = 484;
		String s = "these are numbers";

		msg = String.format("y = %,.2f, z = %d, %s", y, z, s);
		System.out.println(msg);
		System.out.printf("y = %,.2f, z = %d, %s\n", y, z, s);
		
	}
		public static void testStringBuilder(){
			StringBuilder sb = new StringBuilder("This is ");
			sb.append("a sentence.");
			System.out.println(sb.toString());	
		}

		public static void testStringBuilderEfficiency() {
			int size = 25000;
			double[] vals = buildRandomDoubleArray(size);
			String doubleString1 = testStringConcat(vals);
			String doubleString2 = testStringBuilderConcat(vals);
		}

		public static double[] buildRandomDoubleArray(int size) {
			double[] vals = new double[size];
			for( int i=0; i<vals.length; i++ ) {
				vals[i] = Math.random()*1000.0;
			}
			return vals;
		}
		
		public static String testStringConcat(double[] vals) {
			System.out.println("testStringConcat()");
		      long begTime = System.currentTimeMillis();
			String doublesString = "";
			for(double d : vals) {
				doublesString += d + ", ";
			}
			long endTime = System.currentTimeMillis();
		      double totTime = (endTime-begTime)/1000.0;
		      String msg = String.format("  Concatenate %,d doubles = %.3f sec", vals.length, totTime);
		      System.out.println(msg);
			return doublesString;
		}
		
		public static String testStringBuilderConcat(double[] vals) {
			System.out.println("testStringBuilderConcat()");
		      long begTime = System.currentTimeMillis();
			StringBuilder doublesString = new StringBuilder();
			for(double d : vals) {
				doublesString.append(d + ", ");
			}
			long endTime = System.currentTimeMillis();
		      double totTime = (endTime-begTime)/1000.0;
		      String msg = String.format("  Concatenate %,d doubles = %.3f sec", vals.length, totTime);
		      System.out.println(msg);
	 	      return doublesString.toString();
		}
	

}