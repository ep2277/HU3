package se1.hu3.factory;


public class MonitorFactory {

    public Monitor getMonitor(int bildFrequenz, double bildDiagonale, int xPixels, int yPixels) {

        Monitor m=null;

        if (isOfficeMonitor(bildFrequenz, bildDiagonale, xPixels, yPixels)) {
            m= new OfficeMonitor(bildFrequenz, bildDiagonale, xPixels, yPixels);
        }

        if (isGamingMonitor(bildFrequenz, bildDiagonale, xPixels, yPixels)) {
            m= new GamingMonitor(bildFrequenz, bildDiagonale, xPixels, yPixels);
        }

        if (isArtAndDesignMonitor(
                bildFrequenz, bildDiagonale, xPixels, yPixels)) {
            m= new DesignMonitor(bildFrequenz, bildDiagonale, xPixels, yPixels);
        }

        return m;
    }

    private boolean isOfficeMonitor(
            int imageRepetitionFrequency, double screenDiagonal, int resolutionX, int resolutionY) {
        return imageRepetitionFrequency >= 30
                && imageRepetitionFrequency <= 55
                && screenDiagonal >= 23.8
                && screenDiagonal <= 27.0
                && resolutionX >= 1280
                && resolutionX <= 1920
                && resolutionY >= 1024
                && resolutionY <= 1200;
    }

    private boolean isGamingMonitor(
            int imageRepetitionFrequency, double screenDiagonal, int resolutionX, int resolutionY) {
        return imageRepetitionFrequency >= 75
                && imageRepetitionFrequency <= 240
                && screenDiagonal >= 23.8
                && screenDiagonal <= 28.0
                && resolutionX >= 1920
                && resolutionX <= 2560
                && resolutionY >= 1028
                && resolutionY <= 1440;
    }

    private boolean isArtAndDesignMonitor(
            int imageRepetitionFrequency, double screenDiagonal, int resolutionX, int resolutionY) {
        return imageRepetitionFrequency >= 55
                && imageRepetitionFrequency <= 90
                && screenDiagonal >= 31.5
                && resolutionX >= 1920
                && resolutionX <= 3940
                && resolutionY >= 1200
                && resolutionY <= 2160;
    }
}
