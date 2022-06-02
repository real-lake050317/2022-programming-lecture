//import java.util.*;

public class RefCastOvlPoly01
{
	public static void main(String[] args) 
	{
		Object obj=new Object();
		MyShape myshape=new MyShape(); //(5)
		Circle circle=new Circle();
		Square square=new Square();
		PartialCircle partialcircle=new PartialCircle();

		System.out.println(obj.toString()+", "+myshape.toString()+", "+circle.toString()+", "+square.toString()+", "+partialcircle.toString()+" ");
		//System.out.println(obj+", "+myshape+", "+circle+", "+square+", "+partialcircle+" ");

		/* (1)
		System.out.println();
		Object objArr[]=new Object[]{new Object(), new MyShape(),new Circle(),new Square(),new PartialCircle()};
		for(int i=0;i<objArr.length;i++) System.out.print(objArr[i] + ", "); System.out.println();
		//*/

		//* (2)
		System.out.println("\n소팅 전 ");
		MyShape myShapeArr[]=new MyShape[]{new MyShape(),new Circle(),new Square(),new PartialCircle()};
		for(int i=0;i<myShapeArr.length;i++) System.out.print(myShapeArr[i].getClass().getName()+"의 넓이는 "+myShapeArr[i].area() + ", "); System.out.println();

		// (3) 
		//MyShape.sorting(myShapeArr);
		// (4) Arrays.sort(myShapeArr);
		
		//*
		System.out.println("\n소팅 후");
		for(int i=0;i<myShapeArr.length;i++) System.out.print(myShapeArr[i].getClass().getName()+"의 넓이는 "+myShapeArr[i].area() + ", "); System.out.println();
		//*/
	}
}

/*abstract*/ class MyShape //implements Comparable<MyShape>
{
	public double area() { return -50.0; };
	//abstract public double area();

	public String toString() { return "MyShape class Instance"; }

	/*
	public static void sorting(MyShape ms[])
	{
		MyShape temp;
		for(int i=0;i<ms.length;i++){
			int maxIndex=i;
			for(int j=i;j<ms.length;j++){
				maxIndex=(ms[maxIndex].area()<ms[j].area())?j:maxIndex;
			}
			temp=ms[i];
			ms[i]=ms[maxIndex];
			ms[maxIndex]=temp;
		}
		return;
	}
	//*/

	//*
	public int compareTo(MyShape myshape)
	{
		if(this.area()>myshape.area()) return 1;
		else  return -1;

		//if(this.area()>=myshape.area()) return 1;
		//else  return -1;
	}
	//*/
}

class Circle extends MyShape implements Comparable<MyShape>
{
	public double r=100.0;
	public double pi=3.14;

	public double area() { return r*r*pi; }
	public String toString() { return "Circle class Instance"; }	
}

class Square extends MyShape implements Comparable<MyShape>
{
	public double w=500.0;
	public double h=700.0;

	public double area() { return w*h; }
	public String toString() { return "Square class Instance"; }
}

class PartialCircle extends Circle //implements Comparable<PartialCircle>
{
	public double a=180.0;

	public double area() { return super.area()*a/360.0; }
	public String toString() { return "Circle 자손 PartialCircle class Instance"; }
}