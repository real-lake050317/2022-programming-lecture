public class Circle {
    private double radius;
    private double pi = Math.PI;

    public Circle(double a){
        this.radius = a;
    }

    public Circle (int a) {
        this.radius = (double)a;
    }

    public double getSpace(){
        return pi * this.radius * this.radius;
    }

    public double calculateRadius(int a){
        return Math.sqrt(a/pi);
    }
}
