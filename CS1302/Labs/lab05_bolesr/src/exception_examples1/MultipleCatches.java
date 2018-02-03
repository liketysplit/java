package exception_examples1;

public class MultipleCatches {

	static int[] vals = new int[] {2,4,0,6};

	public static void main( String[] args) {

		try {
			divide(1,42);
		}
		catch ( ArithmeticException e ) {
			System.out.println( "Caught ArithmeticException: " + e );
		}
		catch ( RuntimeException e ) {
				System.out.println( "Caught RuntimeException: " + e );
		}
		
	}

	public static int divide(int i, int j) {
		return vals[i]/vals[j];
	}
}