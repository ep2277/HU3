package se1.hu3.composite;

public class LiftCompositeApp {

    public static void main(String args[]) {


	    //  I.) BAUMSTRUKTUR ERZEUGEN
        Skigebiet stubaierGletscher = new Skigebiet("Stubaier Gletscher");        

        // Gondelbahn Eisgratbahn mit 4 Gondeln. (Es wird ein Teilbaum für die Gondeln erzeugt)
        Gondelbahn eisgratbahn= new Gondelbahn("Eisgrat 3-S", 4);
    	stubaierGletscher.addNode(eisgratbahn);

        // Restaurant Gamsgarten
        stubaierGletscher.addNode(new Restaurant("Gamsgarten auf 2300m Seehöhe"));

        // Gondelbahn Schaufeljoch mit 4 Gondeln. (Es wird ein Teilbaum für die Gondeln erzeugt)
        stubaierGletscher.addNode(new Gondelbahn("Schaufeljoch EUB", 4));

        // Restaurant Jochdohle
        stubaierGletscher.addNode(new Restaurant("Jochdohle auf 3150m Seehöhe"));
        
        // Struktur in stdout ausgeben
        System.out.println("\n\nErbaute Struktur:");           
        stubaierGletscher.printNodes();
        
        System.out.println("\nSkigebiet fertig!\n\n");
        
        // II.) STARTUP
        System.out.println("\nSonnenaufgang ... ");
        stubaierGletscher.startupAll();        
        System.out.println("\nSkibetrieb 100%!");
  
        // IV.) BETRIEB
        // Eisgratbahn von 6 auf 7m/s beschleunigen:
        eisgratbahn.setFahrgeschwindigkeit(7);
        System.out.println(eisgratbahn.toString());
        
        // IV.) SHUTDOWN
        System.out.println("\nSkibetrieb wird eingestellt...");       
        stubaierGletscher.shutdownAll();        
    }
}
