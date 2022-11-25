package se1.hu3.adapter;

/** Implementierung der klassischen Kaffeezubereitung lt. Interface  */
public class KaffeezubereitungImpl implements Kaffeezubereitung {

    @Override
    public void kaffeebohnenRoesten() {
        System.out.println("Bohnen werden geroestet");
    }

    @Override
    public void bohnenMahlen() {
        System.out.println("Bohnen werden gemahlen. Duftet gut.");
    }

    @Override
    public void wasserAufgiessen() {
        System.out.println("Bohnen werden mit Wasser aufgegossen");
    }

    @Override
    public void kaffeeAusgeben() {
        System.out.println("Bitte entnehmen Sie Ihren Kaffee!");
    }


}
