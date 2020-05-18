package pl.waw.sgh;

import java.io.File;

public class SpaceCounter {

    public static long occupiedSpace(File directory) {
        long spaceOccup = 0;
        spaceOccup = directory.length();

        return spaceOccup;
    }


    public static void main(String[] args) {
        File dir = new File("src/pl/waw/sgh");

        System.out.println(occupiedSpace(dir));
    }
}
