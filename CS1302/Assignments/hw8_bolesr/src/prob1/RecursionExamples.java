package prob1;

public class RecursionExamples {

	public static void main(String[] args) {
		// sumSeries(n)
		System.out.println("-->sumSeries(n)");
		for(int i=1; i<10; i++) {
			System.out.printf("sumSeries(%d)=%.5f\n", i, sumSeries(i));
		}

		// printReverse(s,n)
		System.out.println("\n-->printReverse(s)");
		String[] strs = {"563412", "53412", "789456123", "78456123", "7456123", "abcdefghijklmnopqrstuvwxyz"};
		int[] nums = {2,2,3,3,3,10};

		int i=0;
		for(String str : strs) {
			int n=nums[i++];
			System.out.printf("printReverse(\"%s\",%d)=", str, n);
			printReverse(str,n);
			System.out.println();
		}

		// printReverse2(s,n)
		System.out.println("\n-->printReverse2(s)");
		i=0;
		for(String str : strs) {
			int n=nums[i++];
			System.out.printf("printReverse2(\"%s\",%d)=", str, n);
			printReverse2(str,n);
			System.out.println();
		}

		// countDigits(str,low,high)
		System.out.println("\n-->countDigits(str,low,high)");
		String[] strs2 = {"abc", "1abc", "2abc2", "2a3bc4", "2a1963bc4", "2a15963bc4"};
		int[] lows = {2,2,2,2,2,3};
		int[] highs = {5,5,5,5,5,7};
		i=0;
		for(String str : strs2) {
			int low=lows[i];
			int high=highs[i++];
			System.out.printf("countDigits(\"%s\",%d,%d)=%d\n", str, low, high, countDigits(str,low,high));
		}

		// countCode(msg,code)
		System.out.println("\n-->countCode(msg,code)");
		String[] msgs = {"a","ac", "ac3", "3ac", "Dac12", "Dac12ac", "Dacac", "acacacac"};
		String[] codes = {"ac", "ac", "ac", "ac", "ac", "ac", "ac", "ac"};
		i=0;
		for(String msg : msgs) {
			System.out.printf("msg=%s, code=%s, count=%d\n", msg, codes[i], countCode(msg,codes[i++]));
		}
	}

	public static double sumSeries(int n) {
		
		if(n==1)
		return 1;
		
		return n + sumSeries(n-1); 
		// *** WRITE CODE HERE ***
	}

	public static void printReverse(String s, int n) {
		
		if ( s.length() == 0){
			System.out.print("");
			return;
		}
		if ( s.length() < n){
			System.out.print(s);
			return;
		}
		System.out.print(s.substring(s.length()-n));
		printReverse(s.substring(0, s.length()-n),n);

		
		// *** WRITE CODE HERE ***
	}

	public static void printReverse2(String s, int n) {
		
		int l = s.length() - n;
		printReverse2(s,n,l);
		
		// *** WRITE CODE HERE ***
	}

	private static void printReverse2(String s, int n, int loc) {
		
		if ( s.length() == 0){
			System.out.print("");
			return;
		}
		if ( s.length() < n){
			System.out.print(s);
			return;
		}
		System.out.print(s.substring(s.length()-n));
		printReverse2(s.substring(0, s.length()-n),n,loc-n);
		
		// *** WRITE CODE HERE ***
	}

	public static int countDigits(String s, int low, int high) {
		
		
		if ( s.length() == 0 )
			return 0;
		if (Character.getNumericValue(s.charAt(0)) > low )//&& Character.getNumericValue(s.charAt(0)) < high)
			return 1 + countDigits(s.substring(1,s.length()), low, high);
		if (Character.getNumericValue(s.charAt(0)) < high)
			return 1 + countDigits(s.substring(1,s.length()), low, high);
		else
			return 0;
		
		// *** WRITE CODE HERE ***, can use helper, or not
	}

	public static int countCode(String msg, String code ) {
		return countCode(msg, code, 0);
		// *** WRITE CODE HERE ***
	}

	private static int countCode(String msg, String code, int pos ) {
		
		if (msg.length() < code.length() || msg.length() == 0)
			return 0;
		
		if (msg.length() == 2 && msg.charAt(pos) == code.charAt(pos) && msg.charAt(pos+1) == code.charAt(pos+1))
			return 1;
		else if (msg.length() ==2)
			return 0;

		if (msg.charAt(pos) == code.charAt(pos) && msg.charAt(pos+1) == code.charAt(pos+1))
			return 1 + countCode(msg.substring(pos+3), code, pos);
		
		else
			return countCode(msg.substring(pos+1), code, pos);
		// *** WRITE CODE HERE ***
	}
}
