package day7.Circle;

public class Circle {
    double radius;
    Circle(){
        radius = 1.0;

    }
    Circle(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
