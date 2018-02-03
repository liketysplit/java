package application;



	import java.util.Arrays;
	import java.util.Scanner;

	public class test {

		static String  stringReverse(String  inputString){
			if( inputString==null) //Checks for the case inputString is undefined
				return inputString;
		           if(inputString.length() <= 1) //Basecase
				return inputString;
			else
				return stringReverse(inputString.substring(1)) + inputString.substring(0,1);
		}


		static int  NumberOfOnes(int n){
			if (n == 0) //Basecase
				return 0;
			if (n % 2 == 1)
				return NumberOfOnes(n/2)+1;
			else if (n % 2 == 0)
				return NumberOfOnes(n/2);
			else //Was needed in compiler so something is for sure returned
				return 0;
		}


	    private double power(double x, int n) {
	    	//Base Case
	        if ( n < 1 ) {
	            return 1;
	        }

	        double halfN = power( x, (n / 2) );
	        //System.out.println(halfN); //Shows steps

	        //Even Numbers
	        if ( n % 2 == 0 ) {
	            return halfN * halfN;
	        }

	        //Odd Numbers
	        else{
	            return x * halfN * halfN;
	        }
		}

		public static void main(String[] args) {
	        test obj=new test();
	        int n = 65;
	        double m = 17.75;
	        System.out.println("------------------Problem 1------------------");
	        System.out.println(stringReverse("mecca"));
	        System.out.println("------------------Problem 1------------------");

	        System.out.println();

	        System.out.println("------------------Problem 2------------------");
	        System.out.println(NumberOfOnes(255));
	        System.out.println("------------------Problem 2------------------");

	        System.out.println();

	        System.out.println("------------------Problem 3------------------");
	        System.out.println(obj.power(m,n));
	        System.out.println("------------------Problem 3------------------");

	    }
	}


