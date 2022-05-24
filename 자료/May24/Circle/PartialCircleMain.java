package 자료.May24.Circle;

class PartialCircleMain 
{
	public static void main(String[] args) 
	{
		Circle a=new Circle();
		a.setRadius(10.0);
		System.out.println("\n현재 설정된  반지름은 "+a.getRadius()+"입니다.");
		System.out.println(a.area());
		System.out.println(a.circumference());

		PartialCircle b=new PartialCircle();
		b.setRadius(10.0);
		b.setAngle(90.0);
		//b.setAngle(360.0);
		//b.setAngle(750.0);
		//b.setAngle(0.0);
		//b.setAngle(-90.0);
		System.out.println("\n현재 설정된  반지름은 "+b.getRadius()+"입니다.");
		System.out.println("현재 설정된 각도는 "+b.getAngle()+"도 입니다.");
		System.out.println(b.area());
		System.out.println(b.circumference());
	}
}
