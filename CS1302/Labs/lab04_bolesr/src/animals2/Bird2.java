package animals2;

public class Bird2 implements Flyer {

	private String name;
	
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "flap-flap";
	}
	
	public Bird2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


}
