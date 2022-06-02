package codes.May30;

public class Circle {
    public static void main(String[] args){
        Myshape w = new MyShape();

        Circle x = new Circle();
        x.setRadius(10.0);

        PartialCircle y = new PartialCircle();
        y.setRadius(10.0);
        y.setAngle(100.0);

        int t[] = new int[3];

        //t = w; 컴파일타임 에러
        //w = t; 컴파일타임 에러
        
    }
}
