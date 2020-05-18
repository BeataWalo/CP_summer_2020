package pl.waw.sgh;

public class Conditions {
    public static void main(String[] args) {
        boolean p = true;
        boolean q = false;

        boolean t = p && q; // and
        boolean v = p ||  q; // or
        boolean w = p && !q; // and negation
        boolean z = p ^ q; // xor

        System.out.println("t: " + t);
        System.out.println("v: " + v);
        System.out.println("w: " + w);
        System.out.println("z: " + z);

        int i;
        if (p && q) {
            i = 10;
            System.out.println("p is true");
            System.out.println("t");
        } else {
            i = 5;
            //System.out.println(i);
            System.out.println("p is false");
        }
        System.out.println(i);

    }
}
