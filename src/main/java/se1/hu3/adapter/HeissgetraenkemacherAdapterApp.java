package se1.hu3.adapter;

public class HeissgetraenkemacherAdapterApp {


    public static void main(String[] args) {

        // Kann eigentlich nur Kaffee zubereiten! (=alte Kaffeemaschine)
        Heissgetraenkemacher hgm;

        // I.
        // Reguläre Verwendung ohne Adapaterklasse --> Kaffee wird erzeugt
        hgm= new Heissgetraenkemacher(new KaffeezubereitungImpl());

        hgm.macheGetraenk(); // <-- Kaffee, was sonst

        // II.
        // Mit Verwendung von Adapterklasse --> Kakao wird erzeugt
        //
        // Die Implementierung "KakaozubereiterImpl" zum Kakao zubereiten ist für den "Heissgetraenkemacher"
        // jedoch leider nicht zuässig, da dieser einen Typ von Kaffeezubereitung im Konstruktor verlangt!
        //
        // Lösung&Trick: Um KakaozubereiterImpl einen Adapter vom Typ Kaffeezubereitung wickeln ("wrappen"):
        hgm= new Heissgetraenkemacher(new KaffeezubereiterAdapter(new KakaozubereitungImpl()));

        hgm.macheGetraenk();   // statt Kaffee dank dem Adapter jetzt Kakao!
                               // OHNE dass am Heissgetraenkemacher etwas geändert wurde


    }
}
