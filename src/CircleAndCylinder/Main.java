package CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle() ;
        circle.setR(15.5);
        System.out.println(circle);
        circle.setAcreage();
        Cylinder cylinder = new Cylinder();
        cylinder.setH(5);
        System.out.println(cylinder);
    }
}
