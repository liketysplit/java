package association3;

public class Person {
	String name;
	Dog[] dogs = new Dog[4];
	int numDogs = 0;

	public Person(String name) {
		this.name = name;
		}

	public Person(String name, Dog[] dogs) {
		this(name);
		for(Dog d : dogs) {
			addDog(d);
		}
	}

	public void loseDog(int i) {
		if(i>=0 && i<numDogs) {
			for(int j=i; j<numDogs-1; j++) {
				dogs[j] = dogs[j+1];
			}
			numDogs--;
		}
	}

	public int getNumDogs() {
		return numDogs;
	}

	public void addDog(Dog d) {
		dogs[numDogs++] = d;
	}

	public String getName() {
		return name;
	}

	public String walkDogs() {
		String msg = "Dog's are walking...:\n";
		for(int i=0; i<numDogs; i++) {
			msg += "   " + dogs[i].walk() + "\n";
		}
		return msg;
	}

	public Dog getDog(int i) {
		if(i>=0 && i<numDogs) {
			return dogs[i];
		}
		return null;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += name + " has " + numDogs + " dogs: ";
		for(int i=0; i<numDogs; i++) {
			msg += dogs[i].getName() + ", ";
		}
		return msg;

	}
}