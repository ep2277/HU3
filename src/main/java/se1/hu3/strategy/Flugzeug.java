package se1.hu3.strategy;

public class Flugzeug {

    private Steuerung steuerung;

    Flugzeug() {
        //used for testing
    }

    public Flugzeug(Steuerung steuerung) {
        this.steuerung = steuerung;
    }

    public void starten(String start) {
        System.out.println("Taking off from "+ start);
    }

    public void landen(String ziel) {
        System.out.println("Landung in "+ ziel+ " geglueckt!");
    }

    public void steuern(double winkel) {
        steuerung.steuern(winkel);
    }

    // hier die neue Strategie unserer Objektvariable 'steuerung' zuweisen.
    public void setSteuermodus(Steuerung steuerung) {
        this.steuerung = steuerung;
    }
}