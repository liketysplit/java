package prob3;

public class UniqueCharsAndDigits {

	public static void main(String[] args) {
		
		String[] aStrings = {"ab1cba2", "34ad5#e", "%*fga1236"}; 
		getUniqueCharsAndDigits(aStrings);
		System.exit(0);
	}
		public static String getUniqueCharsAndDigits (String aStrings[]){
			String uChars = "";
			char c = 'a';
			for (int i = 0; i < aStrings.length; i++){
				for (int k = 0; k < aStrings[i].length(); k++){
					c = aStrings[i].charAt(k);
					
					//check if c isLetterOrDigit
					
					boolean isLD = Character.isLetterOrDigit(c);
					if (isLD == true)
						if (uChars.indexOf(c) == -1){
							uChars += c;
					}
				}
			}
			//check and delete non character and digits
			
			System.out.println ("\nuChars is:" + uChars);
			return uChars;
		
		}	
}
