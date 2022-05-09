package codes.May03;

public class Circle {
    private double radius;
    final public double pi = Math.PI;

    public Circle(){
        System.out.println("Hello, World!");
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
}
