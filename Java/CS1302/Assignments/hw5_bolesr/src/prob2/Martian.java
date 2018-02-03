package prob2;

public abstract class Martian implements Cloneable, Comparable<Martian>{

	private int id;
	private int volume = 0;

	public Martian(int id){
		this.id = id;
	}

	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public int compareTo(Martian m){
		int temp = this.id - m.id;

		if (temp > 0)
			return 1;
		else if (temp == 0)
			return 0;
		else
			return -1;
	}

	public boolean equals(Object o){
		Martian m = (Martian) o;

		if(this.compareTo(m) == 0)
			return true;
		else if (this.compareTo(m) != 0)
			return false;
		else
			return false;
	}

	public int getId(){
		return this.id;
	}

	public int getVolume(){
		return this.volume;
	}

	public void setVolume(int level){
		this.volume = level;
	}

	public abstract String speak();

	public String toString(){
		return String.format("ID: %d, Volume: %d", id, volume);
	}



}
