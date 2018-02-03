package prob2;

public class MartianTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MartianManager LT = new MartianManager();
		GreenMartian Gazoo = new GreenMartian(2);
		RedMartian Marvin = new RedMartian(3);
		GreenMartian Gazoo1 = new GreenMartian(4);
		RedMartian Marvin1 = new RedMartian(5);
		GreenMartian Gazoo2 = new GreenMartian(6);
		RedMartian Marvin2 = new RedMartian(7);
		GreenMartian Gazoo3 = new GreenMartian(8);
		RedMartian Marvin3 = new RedMartian(9);
		GreenMartian Gazoo4 = new GreenMartian(10);
		RedMartian Marvin4 = new RedMartian(11);
		GreenMartian Gazoo5 = new GreenMartian(12);
		RedMartian Marvin5 = new RedMartian(13);
		GreenMartian Gazoo6 = new GreenMartian(14);
		RedMartian Marvin6 = new RedMartian(15);


//		System.out.println(Gazoo.speak());
//		System.out.println(Marvin.speak());

		GreenMartian newGazoo = new GreenMartian(4);
		newGazoo= (GreenMartian) Gazoo.clone();

		System.out.println("Gazoo "+ Gazoo.getVolume());
		Gazoo.setVolume(2);
		System.out.println("Gazoo "+ Gazoo.getVolume());
		newGazoo.setVolume(3);
		System.out.println("Gazoo "+ Gazoo.getVolume());
		System.out.println("newG " + newGazoo.getVolume());



		System.out.println("" + Gazoo.compareTo(Marvin));

		System.out.println("The Gazoos" + Gazoo.equals(newGazoo));



		System.out.println("" + LT.addMartian(Gazoo));
		System.out.println("" + LT.addMartian(Marvin));
		System.out.println("" + LT.addMartian(Gazoo1));
		System.out.println("" + LT.addMartian(Marvin1));
		System.out.println("" + LT.addMartian(Gazoo2));
		System.out.println("" + LT.addMartian(Marvin2));
		System.out.println("" + LT.addMartian(Gazoo3));
		System.out.println("" + LT.addMartian(Marvin3));
		System.out.println("" + LT.addMartian(Gazoo4));
		System.out.println("" + LT.addMartian(Marvin4));
		System.out.println("" + LT.addMartian(Gazoo5));
		System.out.println("" + LT.addMartian(Marvin5));
		System.out.println("" + LT.addMartian(Gazoo6));
		System.out.println("" + LT.addMartian(Marvin6));
		
		System.out.println("" + LT.addMartian(newGazoo));

		System.out.println(LT.getNumMartians());

		System.out.println(LT.groupSpeak());
		System.out.println(LT.groupTeleport("Earth"));
		System.out.println(LT.groupTeleport("Mars"));

		MartianManager ST = new MartianManager();
		ST = (MartianManager) LT.clone();

		ST.getMartianAt(0).setVolume(10);
		System.out.println("ST TEST "+ST.getMartianAt(0).getVolume());

		System.out.println("LT TEST "+LT.getMartianAt(0).getVolume());
		
		GreenMartian Gazoo223 = new GreenMartian(223);
		System.out.println(LT.addMartian(Gazoo223));
		System.out.println(ST.addMartian(Gazoo223));
		System.out.println(LT.getNumMartians());
		
		System.out.println("LT TEST "+LT.getMartianAt(1).getId());
		
		//LT.obliterateTeleporters();
		//LT.removeMartian(2);
		//System.out.println(LT.groupSpeak());
		System.out.println(LT.getNumTeleporters());
		System.out.println(LT.getNumMartians());
		System.out.println(LT.getMartianAt(44));
		System.out.println(LT.getTeleporterAt(44));
		
		System.out.println("\nSorted by ID's : \n" + LT.sortedMartians());
		
	}

}