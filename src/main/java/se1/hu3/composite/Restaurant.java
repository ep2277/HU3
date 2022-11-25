package se1.hu3.composite;

public class Restaurant extends Node {

	public Restaurant(String name) {
		super(name);
	}


	@Override
	public void startup() {
		System.out.println("Griass enk im Restaurant "+ getName() + ":"+ getId()+ ", jetzt geoeffnet.");
	}

	@Override
	public void shutdown() {
		System.out.println("Pfiat enk vom Restaurant "+ getName() + ":"+ getId()+ ", jetzt geschlossen.");
	}
}
