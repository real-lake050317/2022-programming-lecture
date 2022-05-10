package codes.May09;

public class Circle {
    public static int totalC;
    public int count;

    private double radius;
    private double pi = 3.14159;

    public Circle (){
        setRadius(1);
    }

    public Circle (double r){
        setRadius(r);
        totalC++;
    }

    public void setRadius(double r){
        if (r <= 0){
            throw new IllegalArgumentException("Radius should be even number");
        }
        radius = r;
    }
}
