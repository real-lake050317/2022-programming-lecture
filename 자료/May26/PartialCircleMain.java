package May26;
class PartialCircleMain 
{
	public static void main(String[] args) 
	{
		Circle a=new Circle();
		a.setRadius(10.0);
		System.out.println(a.area());
		System.out.println(a.circumference());
		//System.out.println(a.toString());


		PartialCircle b=new PartialCircle();
		//b.setRadius(10.0);
		//b.setAngle(360.0);
		//b.setAngle(750.0);
		//b.setAngle(0.0);
		//b.setAngle(-90.0);

		System.out.println("\n현재 설정된 각도는 "+b.getAngle()+"도 입니다.");
		System.out.println(b.area());
		System.out.println(b.circumference());
		//System.out.println(a.toString());
		//*/


		PartialCircle c;
		//c=new PartialCircle();
		//c=new PartialCircle(58.0);
		//c=new PartialCircle(10.2, 88.4);
		c=new PartialCircle(b);
		System.out.println("\n현재 설정된 반지름은 "+c.getRadius()+"입니다.");
		System.out.println("현재 설정된 각도는 "+c.getAngle()+"도 입니다.");
		System.out.println(c.area());
		System.out.println(c.circumference());
		//System.out.println(a.toString());


		// 아래의 문제들을 클래스가 없는 상황과 클래스가 만들어진 상황에서 각각 프로그래밍해 보시오.

		/* 
			임의의 값을 변의 길이로 가지는 정사각형이 있다고 하자.
			이 정사각형과 최대한 비슷한 넓이를 가진 원이 있다면 그 원의 반지름과 정사각형의 변의 비율은 얼마가 되어야 하는가?
		*/

		/* 
			임의의 값을 반지름으로 가지는 호와 그 값을 변의 길이로 가지는 정사각형이 있다고 하자.
			이 두개의 도형이 최대한 비슷한 넓이를 가지고자 한다면 호의 중심각은 얼마가 되어야 한는가?
		*/

		/* 
			임의의 반지름을 가지는 원과, 그 반지름의 X배를 반지름으로 가지는 호가 있다고 하자.
		    원의 넓이와 호의 넓이가 최대한 같아지는 순간 호의 중심각은 얼마인지 프로그래밍을 통해 알아내시오.
		*/

		Integer abc = new Integer(45);
		abc=35;
		System.out.println(abc.toString());

		int cba=abc;
		System.out.println(cba);
	}
}