public class Main {
    public static void main(String[] args) {

        Point2D p2 = new Point2D(10,20);
        System.out.println(p2);
        float[] a = p2.getXY();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Point3D p3 = new Point3D(5,10,15);
        System.out.println(p3);

    }
}
