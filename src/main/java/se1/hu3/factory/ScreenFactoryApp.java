package se1.hu3.factory;

public class ScreenFactoryApp {
    public static void main(String[] args) {


        // Monitorfabrik bauen
        MonitorFactory monitorFactory = new MonitorFactory();

        Monitor m1= monitorFactory.getMonitor(30, 23.8, 1280, 1200);
        Monitor m2= monitorFactory.getMonitor(75, 28, 1920, 1028);
        Monitor m3= monitorFactory.getMonitor(55, 35, 3840, 2160);

        System.out.println("Monitor 1: "+m1.getMonitorArt() + " -  Klasse: "+m1.getClass().getName());
        System.out.println("Monitor 2: "+m2.getMonitorArt() + " -  Klasse: "+m2.getClass().getName());
        System.out.println("Monitor 3: "+m3.getMonitorArt() + " -  Klasse: "+m3.getClass().getName());


    }
}
