package exception_examples1;

public class RethrowFinally {

	public static void main( String[] args) {
		try {
			System.out.println("Value is: " + divide(17,5));
		}
		catch ( RuntimeException e ) {
			System.out.println( "Caught in main:\n  " + e );
		}
	}

	public static double divide(int x, int y) {
		try{
			double z = x/y;
			return z;
		}
		catch(RuntimeException e) {
			throw e;
		}
		finally{
			System.out.println("finally block " +
		       "executed in divide");
		}
	}
}