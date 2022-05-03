package codes.May03;

public class Circle {
    private double radius;
    final public double pi = Math.PI;

    public void setRadius(double r){
        if (r <= 0){
            throw new IllegalArgumentException("Radius should be even number");
        }
        radius = r;
    }

    public double areaCircle(){
        return radius*radius*pi;
    }
}
