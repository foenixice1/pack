package CircleAndCylinder;

public class Circle {

    double r=1;
    String color = " blue";

    public Circle() {

    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double setAcreage() {
        return r * r * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' + " acreage= " + setAcreage() +
                '}';
    }
}
