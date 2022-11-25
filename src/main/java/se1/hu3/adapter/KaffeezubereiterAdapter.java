package se1.hu3.adapter;


/**
 *  Adapterklasse "KaffeezubereiterAdapter"
 *  Hier wird die Funktionalität des Interfaces "Kakaozubereitung"
 *  zu jenem der "Kaffeezubereitung" adaptiert.
 */
public class KaffeezubereiterAdapter implements Kaffeezubereitung {

    KakaozubereitungImpl kk;

    public KaffeezubereiterAdapter(KakaozubereitungImpl kk) {

        this.kk = kk;
    }


    @Override
    public void kaffeebohnenRoesten() {   // Kaffeemethode
        kk.pulvermengeBestimmen();        // --> Kakaomethode
    }

    @Override
    public void bohnenMahlen() {         // Kaffeemethode
        // Kakao muss nicht gemahlen werden, also hier jetzt mal nichts tun.
    }

    @Override
    public void wasserAufgiessen() {   // Kaffeemethode
        kk.mitWasserVermischen();      // --> Kakaomethode
    }

    @Override
    public void kaffeeAusgeben() {     // Kaffemethode
        kk.kakaoAusgeben();            // -->Kakaomethode
    }
}