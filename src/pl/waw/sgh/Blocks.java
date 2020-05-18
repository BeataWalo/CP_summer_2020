package pl.waw.sgh;

public class Blocks {

    static int d = 10;
    // d moge użyc wszędzie tu i w innych klasach jak napiszę pl.waw.sgh.Blocks.d
    public static void main (String[] args) {
        int a = 5;
        {
            int b = 6;
            System.out.println(a);
            System.out.println(b);
        }
        // tu już nie mogę użyć b, bo jest poza nawiasami, gdzie opisałam b
    }
}
