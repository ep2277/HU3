package se1.hu3.composite;


public class Gondelbahn extends Node {

	/** Gondelbahn mit Gondeln dran. Für jede Gondel wird eine Instanz vom Typ Fahrbetriebsmittel hinzugefügt */
	public Gondelbahn(String name, int anzahlGondeln) {
		super(name);
		for(int i=0; i< 4; i++) {   // Vier Gondeln erzeugen und zur Bahn bringen
			Fahrbetriebsmittel fbm= new Fahrbetriebsmittel(name+"-Gondel");
			addNode(fbm);
		}
	}


	// Dieser Gondelbahn-Node kann mit einer einstellbaren Geschwindigkeit betreiben werden.
	private double fahrgeschwindigkeit=0;

	/** Aktuelle Geschwindigkeit in m/s */
	public double getFahrgeschwindigkeit() {
		return fahrgeschwindigkeit;
	}

	/** Aktuelle Geschwindigkeit in m/s */	
	public void setFahrgeschwindigkeit(double fahrgeschwindigkeit) {
		double vOld= this.fahrgeschwindigkeit;
		this.fahrgeschwindigkeit = fahrgeschwindigkeit;
		System.out.println("Sollfahrtregler "+ getName() + " von bisher "+vOld+" m/s auf neu v="+this.fahrgeschwindigkeit +" m/s gestellt.");
	}

	@Override
	public void startup() {
		setFahrgeschwindigkeit(6);
		System.out.println("Gondelbahn "+ getName() + " in Betrieb.");
	}

	@Override
	public void shutdown() {
		setFahrgeschwindigkeit(0);
		System.out.println("Gondelbahn "+ getName() + " hat Betrieb eingestellt.");
	}
	
	public String toString() {
		return super.toString()+ ", v= "+getFahrgeschwindigkeit()+ " m/s";
	}
	
}

