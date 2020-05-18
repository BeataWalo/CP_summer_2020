package pl.waw.sgh.obj;

public class PlayWIthRecktangles {

    public static void main(String[] args) {
//        int staticSurface = Rectangle.calcSurfaceStatic(10);
//        System.out.println(staticSurface);

        //Rectangle r1 = new Rectangle();
        //r1.parA = 14;
        //r1.setParams(4, 4);
//        Rectangle r1 = new Rectangle(4, 4);
//
//        int surface = r1.calcSurfaceWithParC();
//        Rectangle.parC = 100;
//        System.out.println("Surface r1: " + surface);
//        Rectangle r2 = new Rectangle();
//        r2.setParams(3, 6);

        // System.out.println("parA of r2: " + r2.parA);
//        System.out.println("Surface r2: " + r2.calcSurfaceWithParC());


        Rectangle ra = new Rectangle();
        Rectangle rb = new Rectangle();

        ra.parB = 9;
        //why cant I change in this way also parA? because of this "private int"?

        System.out.print("ra: ");
        ra.setParams(4, 5);
        System.out.print("rb: ");
        rb.setParams(7, 2);

        System.out.println("ra: " + ra.calcSurface());
        System.out.println("rb: " + rb.calcSurface());

        System.out.println("ra: " + ra.calcSurfaceWithParC());
        System.out.println("rb: " + rb.calcSurfaceWithParC());


    }
}
