package exception_examples1;

public class BirdException extends RuntimeException{
	private int nameLength;

	public BirdException(String desc, int nameLength) {
		super(desc);
		this.nameLength = nameLength;
	}

	public int getNameLength() {
		return nameLength;
	}
}
