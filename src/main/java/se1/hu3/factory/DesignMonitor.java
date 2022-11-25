package se1.hu3.factory;


public class DesignMonitor extends Monitor {
    public DesignMonitor(int bildFrequenz, double bildDiagonale, int xPixels, int yPixels) {
        super(bildFrequenz, bildDiagonale, xPixels, yPixels);
    }

    @Override
    public String getMonitorArt() {
        return "Grafik-Designer-Bildschirm: Beste Farbtreue und Grauwertwiedergabe für die Kunst!";
    }
}