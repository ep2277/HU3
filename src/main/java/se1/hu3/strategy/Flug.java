package se1.hu3.strategy;

public class Flug implements Steuerung {

    @Override
    public void steuern(double winkel) {
        System.out.println("Flugzeug Kursaenderung im Flug um "+winkel+" Grad");
    }
}
