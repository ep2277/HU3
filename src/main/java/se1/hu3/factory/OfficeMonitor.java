package se1.hu3.factory;

public class OfficeMonitor extends Monitor {
    public OfficeMonitor(int bildFrequenz, double bildDiagonale, int xPixels, int yPixels) {
        super(bildFrequenz, bildDiagonale, xPixels, yPixels);
    }

    @Override
    public String getMonitorArt() {
        return "Office-Bildschirm: Entspiegelt für angenehmes Arbeiten";
    }
}
