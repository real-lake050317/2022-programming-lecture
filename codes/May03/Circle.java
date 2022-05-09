package codes.May03;

public class Circle {
    private double radius;
    final public double pi = Math.PI;

    public Circle(){
        radius = 1.0;
        
    }

    public Circle(double r){
        setRadius(r); //캡슐화 가능
    }

    public void setRadius(double r){
        if (r <= 0){
            throw new IllegalArgumentException("Radius should be even number");
        }
        radius = r;
    }

    public double getPi() {
        return pi;
    }

    public double areaCircle(){
        return radius*radius*pi;
    }

    public double getRadius(){
        return radius;
    }
}
