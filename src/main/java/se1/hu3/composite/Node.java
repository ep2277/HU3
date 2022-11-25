package se1.hu3.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Ein Composite-Component Node (Knoten) nach dem "Teile-Ganzes-Prinzip" in Baumstruktur.
 * Abstrakte Klasse.
 * --> Implementierende Klassen _erben_ die Basisfunktionalitäten zur Knotenverwaltung im Baum.
 * --> Implementierende Klassen _ergänzen_ spezielles Verhalten durch eigene Node-Typen.
 *
 * Die abstrakte Klasse Node kann:
 *    - Bei Instantiierung sich eine eigene Unique ID vergeben, und ihren Namen merken
 *    - Kinder-Nodes verwalten: addNode(), removeNode(), removeAllNodes()
 *    - Rekursiv von diesem Node bis in alle End-Nodes (Blätter!) "hochfahren": startupAll()
 *    - Rekursiv von allen End-Nodes bis zu diesem Node "anhalten":  shutdownAll()
 *    - Rekursiv von diesem Node bis in alle End-Nodes die Baumhierarchie ausgeben: printNodes()
 *    - Sich selbst beschreiben: toString()
 *
 *    Implementierende Klassen müssen alle abstrakten Methoden implementieren:
 *    + Node hochfahren: startup()
 *    + Node anhalten: shutdown()
 */
public abstract class Node {

	private static int idCounter=1000;  // zur Erzeugung von unique ID's 
	protected static final int getUniqueId() { return idCounter++; }  // nicht Threadsafe!
	
	private int id;
    private String name;	
    private List<Node> childNodes= null;

	
    // Erzeuge neuen Knoten mit gegebenem Namen, vergebe mir selbst Unique ID
    public Node(String name)
    {
    		this.name= name;
    		id= getUniqueId();
    }
    
    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
   
	
	/** ABSTRACT: starte diese Komponente.  */
	public abstract void startup();
	
	/** ABSTRACT: stoppe diese Komponente */
	public abstract void shutdown();
	
	
	/** Diesen Knoten starten, und dann rekursiv alle Kinderkomponenten starten */
    public void startupAll() {    	
    	startup(); // abstrakte Methode! -> Je nach implementierenden Node-Typ unterschiedliches Verhalten
    	if (childNodes == null) {
    		return; // Terminaler Knoten  	
    	}
    
    	for (Node n : childNodes) {
    		n.startupAll();   // Rekursion ...
    	}
    }
	
	
	/** Rekursiv ausgehend von den Endknoten alle Kinderkomponenten stoppen, und dann diese hier */
    public void shutdownAll() {    	
     	
    	if (childNodes != null) {
        	Collections.reverse(childNodes);   // Kinder umgekehrt abschalten
    		for (Node n : childNodes) {
        		n.shutdownAll(); // Rekursion
    		}
    	}
		shutdown();	  	// abstrakte Methode! -> Je nach implementierenden Node-Typ unterschiedliches Verhalten
    }

    

	public String toString()
	{
		return "Id: "+ id +" Typ: "+ getClass().getSimpleName()+ "  Name: "+name;
	}	
	
	public void printNodes() {
		printNodes(0);
	}

    private void printNodes(int depth) {
    	
    	for (int i=0; i< depth; i++)
    		System.out.print("..");  // Knotenebenen Einrücken
    	System.out.println(toString());
    	
    	if (childNodes == null) {
    		return; // Terminaler Knoten  	
    	}
    
    	depth++;
    	for (Node n : childNodes) {
    		n.printNodes(depth);
    	}

		// Zwei alternative Formulierungen für Schleifen über Collections:
    	// Alternative 1: mit forEach und Lambda Funktion
    	// childNodes.forEach(childNodes -> { childNodes.printNodes();} );
    	    		
    	// Alterntive 2:	mit forEach und Method Reference Syntax
        // childNodes.forEach(Node::printNodes); 
    }

	/** Einzelnen Kinder-Node hinzufügen */
    public void addNode(Node node) {
    	if (childNodes == null)     
    		childNodes= new ArrayList<Node>();  // Lazy instantiation
        childNodes.add(node);
    }

	/** Einzelnen Kinder-Node entfernen
	 * @returns true wenn Node gefunden und entfernt, false sonst
	 * */
    public boolean removeNode(Node node) {
    	if (childNodes == null)
    		return false;
        return childNodes.remove(node);
    }	

	/** Alle Kinder-Nodes entfernen */
    public void removeAllNodes() {
    	if (childNodes == null)
    		return;
        childNodes.clear();
        childNodes= null;
    }		
}
