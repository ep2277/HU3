package se1.hu3.singleton;

public class MacAddressSingletonApp {
    private static final int NUMBER_OF_ADDRESSES = 20;

    public static void main(String[] args) {
        MacAddressgenerator macAddressSingleton = MacAddressgenerator.getInstance();
        System.out.println("Generating "+NUMBER_OF_ADDRESSES+" unique MAC-Addresses:");
        for (int i = 1; i <= NUMBER_OF_ADDRESSES; i++) {
            //System.out.println(i+": "+ MacAddressgenerator.getInstance().getUniqueMacAddress());
            System.out.println(i+": "+ MacAddressgenerator.getInstance().generateMacAdress());

        }


    }
}
