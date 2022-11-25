package se1.hu3.factory;

public abstract class Monitor {

    int bildFrequenz;
    double bildDiagonale;
    int xPixels;
    int yPixels;


    public Monitor(int bildFrequenz, double bildDiagonale, int xPixels, int yPixels) {
        this.bildFrequenz= bildFrequenz;
        this.bildDiagonale= bildFrequenz;
        this.xPixels= bildFrequenz;
        this.yPixels= bildFrequenz;
    }

    public abstract String getMonitorArt();
}
