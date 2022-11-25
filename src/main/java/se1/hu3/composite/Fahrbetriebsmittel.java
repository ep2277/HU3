package se1.hu3.composite;

public class Fahrbetriebsmittel extends Node {

	public Fahrbetriebsmittel(String name) {
		super(name);
	}


	@Override
	public void startup() {
		System.out.println("Gondel "+ getName() + ":"+ getId()+ " auf der Strecke.");		
	}

	@Override
	public void shutdown() {
		System.out.println("Gondel "+ getName() + ":"+ getId()+ " garagiert.");
	}
}
