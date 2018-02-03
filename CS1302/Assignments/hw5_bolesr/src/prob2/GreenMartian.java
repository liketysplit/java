package prob2;

public class GreenMartian extends Martian implements Teleporter{

	public GreenMartian(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public String speak(){
		return String.format("ID: %d,  Well, if the shoe fits...", getId());
	}
	
	public String toString(){
		return String.format("Green Martian - ID = %d, Volume: %d", getId(), getVolume());

	}
	@Override
	public String teleport(String dest){
		return "Green Martian - ID: "+ this.getId() + " is teleporting to " + dest;
	}


}
