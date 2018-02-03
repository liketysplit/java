package prob2;

public class RedMartian extends Martian{

	public RedMartian(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public String speak(){
		return String.format("ID: %d, Where's the kaboom? There was supposed to be an earth-shattering kaboom!", getId());
	}
	
	@Override
	public String toString(){
		return String.format("Red Martian - ID = %d, Volume: %d", getId(), getVolume());

	}
	
}
