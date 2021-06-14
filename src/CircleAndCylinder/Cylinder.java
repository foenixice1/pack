package CircleAndCylinder;

public class Cylinder extends Circle {
    double h;

    public Cylinder() {

    }

    public double getH() {

        return h;
    }

    public void setH(double h) {

        this.h = h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", h=" + h + " Thể tích= " + setVolume() +
                '}';
    }

    public double setVolume() {

        return Math.PI * r * r * h;
    }

}
