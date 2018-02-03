package ver1;

public class Driver {
	public static void main(String[] args) {
		WolfDog wd = new WolfDog("Juno");
		System.out.println(wd.toString());
		System.out.println(wd.bark());
		System.out.println(wd.howl());

		Dog d = new WolfDog("Leo");
		System.out.println(d.toString());
		System.out.println(d.bark());

		if( d instanceof WolfDog) {
			WolfDog wd2 = (WolfDog)d;
			System.out.println(wd2.howl());

		//Dog d3 = new Dog("Gigi");
		//WolfDog wd3 = (WolfDog)d3;

		}

	}
}
