public class Square {
    private double side;
    
    public Square(int a){
        this.side = (double)a;
    }

    public Square(double a){
        this.side = a;
    }

    public double getSpace(){
        return this.side * this.side;
    }

    

}
