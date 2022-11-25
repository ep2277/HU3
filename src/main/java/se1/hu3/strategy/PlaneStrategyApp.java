package se1.hu3.strategy;

public class PlaneStrategyApp {

    public static void main(String[] args) {

        Steuerung boden= new Boden();
        Steuerung flug= new Flug();

        Flugzeug flugzeug = new Flugzeug(boden);

        flugzeug.steuern(30.18);

        flugzeug.starten("Innsbruck");
        flugzeug.setSteuermodus(flug);

        flugzeug.steuern(20.54);

        flugzeug.landen("Wien");
        flugzeug.setSteuermodus(boden);
        flugzeug.steuern(10.63);
    }
}
