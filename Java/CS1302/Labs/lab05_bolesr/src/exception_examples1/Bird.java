package exception_examples1;

public class Bird {
	private String name;
	public Bird(String name) {
		if( name.length() < 5) {
		    throw new BirdException("Bird name length too short", name.length());
		}
		else {
		    this.name = name;
		}
	}

	@Override
	public String toString() {
		return "Bird's name is: " + name;
	}
	
	public static void main(String[] args) {
		Bird b;
		try{
			b = new Bird("Yoyo");
		}
		catch(BirdException be) {
			System.out.println(be);
			String msg = "Name length must be at least 5 characters, ";
			msg += "your name was: " + be.getNameLength();
			System.out.println(msg);
			
		}
	}
}