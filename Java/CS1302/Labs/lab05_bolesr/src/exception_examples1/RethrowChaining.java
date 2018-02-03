package exception_examples1;

public class RethrowChaining {
	public static void main( String[] args) {
		try {
			method1();
		}
		catch ( RuntimeException e ) {
			System.out.println( "Caught in main:\n  " + e );
			System.out.println( "Chained exception:\n  " + e.getCause() );
			System.out.println( "\nException's stack trace:\n" );
			e.printStackTrace();
			
		}
	}
	public static void method1() {
		try{
			method2();
		}
		catch(RuntimeException e) {
			throw new RuntimeException("originated in method1()", e);
		}
	}
	public static void method2() {
		throw new RuntimeException("originated in method2()");
	}
}