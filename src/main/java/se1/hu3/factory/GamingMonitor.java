package se1.hu3.factory;

    public class GamingMonitor extends Monitor {
        public GamingMonitor(int bildFrequenz, double bildDiagonale, int xPixels, int yPixels) {
            super(bildFrequenz, bildDiagonale, xPixels, yPixels);
        }

        @Override
        public String getMonitorArt() {
            return "Gaming-Bildschirm: Superschnelles LCD für die Weltherrschaft";
        }
    }
