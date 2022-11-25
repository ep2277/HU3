package se1.hu3.adapter;


/** Implementierung der klassischen Kakaozubereitung lt. Interface  */
public class KakaozubereitungImpl implements Kakaozubereitung {

    @Override
    public void pulvermengeBestimmen() {
        System.out.println("Kakaopulver wird bestimmt ");
    }

    @Override
    public void mitWasserVermischen() {
        System.out.println("Kakaopulver wird mit Wasser vermengt ");
    }

    @Override
    public void kakaoAusgeben() {
        System.out.println("Bitten enthemen Sie den Kakao!");
    }


}
