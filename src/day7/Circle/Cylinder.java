package day7.Circle;

public class Cylinder extends  Circle{
    double height;
    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }
    public double findVolume(){
        return findArea()*height;
    }
    public Cylinder(){
        this.height = 1.0;
        this.radius = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
