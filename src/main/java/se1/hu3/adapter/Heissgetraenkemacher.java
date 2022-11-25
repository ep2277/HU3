package se1.hu3.adapter;


/**
 * Alte Kaffemaschine.
 * Kann nur mit Instanzen vom Typ Kaffeezubereitung arbeiten (--> Konstruktor).
 *
 * Es könnte sich ein um Java Code handeln, den wir verwenden müssen, aber nicht
 * ändern dürfen oder können, zB. da nur als *.class Dateien vorliegend von Fremdfirma.
 *
 */
public class Heissgetraenkemacher {

    private Kaffeezubereitung heissgetraenkemacher;

    public Heissgetraenkemacher(Kaffeezubereitung heissgetraenkemacher) {
        this.heissgetraenkemacher = heissgetraenkemacher;
    }



    public void macheGetraenk() {

        heissgetraenkemacher.kaffeebohnenRoesten();
        heissgetraenkemacher.bohnenMahlen();
        heissgetraenkemacher.wasserAufgiessen();
        heissgetraenkemacher.kaffeeAusgeben();
        System.out.println("Getränk ist fertig!");
    }
}


