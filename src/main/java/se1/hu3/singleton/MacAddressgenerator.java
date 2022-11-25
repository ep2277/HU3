package se1.hu3.singleton;

import java.util.Random;

public class MacAddressgenerator {

    // Durch Java-Classloader genau 1 x aufgerufen
    private static MacAddressgenerator macAddressgenerator = new MacAddressgenerator();

    private MacAddressgenerator() {}


    public static MacAddressgenerator getInstance() {
        return macAddressgenerator;
    }

   private long lastAddr=1;


    synchronized public String getUniqueMacAddress() {
        lastAddr++;
        return ""+lastAddr;
    }
    public String generateMacAdress() {
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte) (macAddr[0] & (byte) 254);

        StringBuilder stringBuilder = new StringBuilder(18);

        for (byte macChar : macAddr) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(":");
            }

            stringBuilder.append(String.format("%02x", macChar));
        }

        return stringBuilder.toString();
    }


    /*
    // found on Stackoverflow: https://stackoverflow.com/a/24262057/8004742
    private String generateMacAdress() {
        Random rand = new Random();
        byte[] macAddr = new byte[6];
        rand.nextBytes(macAddr);

        macAddr[0] = (byte) (macAddr[0] & (byte) 254);

        StringBuilder stringBuilder = new StringBuilder(18);

        for (byte macChar : macAddr) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(":");
            }

            stringBuilder.append(String.format("%02x", macChar));
        }

        return stringBuilder.toString();
    }

     */
}
