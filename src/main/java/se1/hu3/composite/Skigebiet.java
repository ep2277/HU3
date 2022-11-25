package se1.hu3.composite;




public class Skigebiet extends Node {

	public Skigebiet(String name) {
		super(name);
	}

	@Override
	public void startup() {
		System.out.println("Skigebiet "+ getName() + " wacht auf...");		
	}

	@Override
	public void shutdown() {
		System.out.println("Skigebiet "+ getName() + " ist heruntergefahren.");			
	}	
	
	
}

