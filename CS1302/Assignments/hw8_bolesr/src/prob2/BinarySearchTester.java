package prob2;

import java.util.ArrayList;

public class BinarySearchTester {

	public static int binarySearch( ArrayList<Blob> blobs, Blob bKey1, Blob bKey2 ) {
		// ---> WRITE THIS METHOD <---
		// Write code here to implement as described in problem description.
		// Need to write a recursive helper method also.
		return binarySearch(blobs, bKey1, bKey2, 0, blobs.size()-1);
	}

	private static int binarySearch(ArrayList<Blob> blobs, Blob bKey1, Blob bKey2, int i, int j) {
		// TODO Auto-generated method stub
		if( i >= j ) // key not found
			return -(i+1);
		else{
			int mid = ((i+j)/2);

			if (mid%2 != 0)
				mid++;

			if ( (bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor() ) < (blobs.get(mid-1).getCoolnessFactor() + blobs.get(mid-2).getCoolnessFactor()))
				//System.out.println("Debug Info: Smaller" + mid + i + j);
				return binarySearch(blobs, bKey1, bKey2, i, mid-2);

			else if ( ( bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor() ) > (blobs.get(mid).getCoolnessFactor() + blobs.get(mid+1).getCoolnessFactor()))
				//System.out.println("Debug Info: Smaller" + mid + i + j);
				return binarySearch(blobs, bKey1, bKey2, mid+2, j);

			if ( ( bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor() ) == (blobs.get(mid).getCoolnessFactor() + blobs.get(mid+1).getCoolnessFactor()))
				return mid;
			if ( (bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor()) == (blobs.get(mid-1).getCoolnessFactor() + blobs.get(mid-2).getCoolnessFactor()))
				return mid-2;

			else
				return mid;
		}
	}

	public static void main( String[] args ) {
		// Sample code to create a sorted Blob list with 5 twins (10 elements).
		// You should make sure your code works with other numbers of twins.
		// ---> WRITE CODE HERE TO TEST <---

		ArrayList<Blob> blobs = buildBlobList(40);
		printBlobList(blobs);


		System.out.println("\n\t Blob 2, 0: " + binarySearch(blobs, new Blob(2),  new Blob(0)));
		System.out.println("\n\t Blob 14, 0: " + binarySearch(blobs, new Blob(14),  new Blob(0)));
		System.out.println("\n\t Blob 20, 0: " + binarySearch(blobs, new Blob(20),  new Blob(0)));
		System.out.println("\n\t Blob 28, 0: " + binarySearch(blobs, new Blob(28),  new Blob(0)));
		System.out.println("\n\t Blob 40, 0: " + binarySearch(blobs, new Blob(40),  new Blob(0)));
		System.out.println("\n\t Blob 32, 0: " + binarySearch(blobs, new Blob(32),  new Blob(0)));

	}

	// You may use this method to build and return a sorted Blob
	// list based on sum of coolness factor for each of the twins.
	// Creates "numTwins" twins (i.e. 2*numTwins elements)
	private static ArrayList<Blob> buildBlobList(int numTwins) {
		ArrayList<Blob> blobs = new ArrayList<>();
		int cNess = 2;
		for(int i=1; i<=numTwins; i++) {
			Blob b1 = new Blob(cNess);
			cNess+=2;
			Blob b2 = new Blob(cNess--);
			blobs.add(b1);
			blobs.add(b2);
		}
		return blobs;
	}

	// You may use this method to print a blob list in a way that
	// emphasizes the twins and the sum of their coolness factors.
	private static void printBlobList(ArrayList<Blob> blobs) {
		StringBuilder sb = new StringBuilder("Sorted Blob list:\n");
		for(int i=0; i<blobs.size(); i+=2) {
			int cNess1 = blobs.get(i).getCoolnessFactor();
			int cNess2 = blobs.get(i+1).getCoolnessFactor();
			int twinPower = cNess1 + cNess2;
			sb.append(String.format("B(%d)+B(%d)=%d, ", cNess1, cNess2, twinPower));
		}
		sb.delete(sb.length()-2, sb.length());
		System.out.println(sb.toString());
	}
}
