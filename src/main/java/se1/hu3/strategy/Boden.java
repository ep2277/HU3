package se1.hu3.strategy;

public class Boden implements Steuerung {

    @Override
    public void steuern(double winkel) {
        System.out.println("Flugzeug am Boden um "+winkel+" gelenkt");
    }
}
