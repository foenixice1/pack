package Quat;

public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
       fan1.setSpeed(fan1.getFAST());
       fan1.setRadius(10);
        fan1.setColor("yellow");
      fan1.setOn(true);
        fan1.toString();
       Fan fan2 = new Fan();
       fan2.setSpeed(fan2.getMEDIUM());
       fan2.setRadius(5);
       fan2.setColor("blue");
       fan2.setOn(false);
       fan2.toString();
    }
}
