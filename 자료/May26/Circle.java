package May26;
/**
*	@author		CHKIM &lt;chkim@minjok.hs.kr&gt;
*	@version	0.1
*	@since		2020.02.20 - 6장까지의 기능이 구현된 Circle클래스입니다.

*	<p>
*	version 0.1의 Circle클래스는 6장까지의 기능을 구현한 클래스로 하나의 클래스에 필요로 하는 문법과 encapsulation기능이 구현되어 있는 클래스입니다.
*	</p>
*/
public class Circle
{
	/**
	*	radius는 Circle클래스의 가장 중요한 인스턴스 멤버변수로 현재 생성되는 인스턴스의 반지를을 저장하기 위하여 사용한다.
	*/
	private double radius;
	private double pi=3.141592;
	/**
	*	NINST는 현재 인스턴스의 생성 순서를 세기 위한 상수이다.
	*/
	public final int NINST;
	private static int nOfCircles;

	/**
	*	기본 생성자이며 생성시 반지름은 1.0으로 세팅한다.
	*/
	public Circle()
	{
		this(1.0);
		//System.out.println("첫번째 생성자 입니다.");
	}

	/**
	*	인수로 지정한 반지름을 가지는 생성자 입니다.
	*	주어진 인수의 값이 음수라면 그 값의 절대값을, 0.0이라면 1.0을 반지름으로 세팅합니다. 그 외에는 주어진 값을 반지름으로 세팅합니다.
	*	@param radius 세팅하고자하는 실수값을 인수로 제공해야 합니다.
	*/
	public Circle(double radius)
	{
		this.setRadius(radius);
		nOfCircles++;
		NINST=nOfCircles;
		//System.out.println("두번째 생성자 입니다.");
	}

	/**
	*	이미 생성된 인스턴스와 동일한 상태의 인스턴스를 생성하기 위한 복사생성자입니다.
	*	@param c 복사하고자 하는 인스턴스를 참조하는 변수를 인수로 제공해야 합니다.
	*/
	public Circle(Circle c)
	{
		this(c.radius);
		//System.out.println("세번째 생성자 입니다.");
	}

	/**
	*	주어진 인수의 값이 음수라면 그 값의 절대값을, 0.0이라면 1.0을 반지름으로 세팅합니다. 그 외에는 주어진 값을 반지름으로 세팅합니다.
	*	@param radius	세팅하고자하는 실수값을 인수로 제공해야 합니다.
	*/
	public void setRadius(double radius)
	{
		if(radius<0.0) {
			System.out.println("반지름은 0.0보다는 커야 합니다. 반지름을 "+ (-radius)+"로 설정합니다.");
			this.radius=-radius;
		}
		else if(radius==0.0) {
			System.out.println("반지름은 0.0보다는 커야 합니다. 반지름을 1.0으로 설정합니다.");
			this.radius=1.0;
		}
		else this.radius=radius;
	}

	/**
	*	현재 인스턴스에 세팅되어 있는 반지름의 값을 반환합니다.
	*	@return double	현재 인스턴스에 세팅되어 있는 반지름의 값을 반환합니다.
	*/
	public double getRadius()
	{
		return this.radius;
	}

	/**
	*	현재 인스턴스에 세팅되어 있는 원주율의 값을 반환합니다.
	*	@return double	현재 인스턴스에 세팅되어 있는 원주율의 값을 반환합니다.
	*/
	public double getPi()
	{
		return this.pi;
	}

	/**
	*	Circle 인스턴스의 총 숫자를 반환합니다.
	*	@return int	Circle 인스턴스의 총 숫자를 반환합니다.
	*/
	public static int getNumbersOfCircles()
	{
		return nOfCircles;
	}

	/**
	*	현재 인스턴스의 세팅되어 있는 반지름을 가지는 원의 넓이를 반환합니다.
	*	@return double	현재 인스턴스의 세팅되어 있는 반지름을 가지는 원의 넓이를 반환합니다.
	*/
	public double area()
	{
		return this.radius*this.radius*this.pi;
	}

	/**
	*	인수로 주어진 반지름을 가지는 원의 넓이를 반환합니다.
	*	@param radius	넓이를 알고자하는 원의 반지름을 인자로 제공해야 합니다.
	*	<p> - 반지름을 0.0 이하로 세팅하는 경우에 대하여 특별히 대비하지 않고 있습니다. </p>
	*	<p> - 올바른 결과를 얻고자 한다면 양수의 실수형 반지름을 인자로 제공하세요. </p>
	*	@return double 주어진 반지름을 가지는 원의 넓이를 반환합니다.
	*/
	public static double area(double radius)
	{
		return radius*radius*Math.PI;
	}

	/**
	*	현재 인스턴스의 세팅되어 있는 반지름을 가지는 원의 둘레를 반환합니다.
	*	@return double	현재 인스턴스의 세팅되어 있는 반지름을 가지는 원의 둘레를 반환합니다.
	*/
	public double circumference()
	{
		return 2.0*this.radius*this.pi;
	}

	/**
	*	인수로 주어진 반지름을 가지는 원의 둘레를 반환합니다.
	*	@param radius	둘레를 알고자하는 원의 반지름을 인자로 제공해야 합니다.
	*	<p> - 반지름을 0.0 이하로 세팅하는 경우에 대하여 특별히 대비하지 않고 있습니다. </p>
	*	<p> - 올바른 결과를 얻고자 한다면 양수의 실수형 반지름을 인자로 제공하세요. </p>
	*	@return double 주어진 반지름을 가지는 원의 둘레를 반환합니다.
	*/
	public static double circumference(double radius)
	{
		return 2.0*radius*Math.PI;
	}

	/**
	*	Circle클래스를 이용하여 생성된  인스턴스 총 숫자와 현재 인스턴스의 상황을 출력합니다.
	*/
	public void printInfo()
	{
		System.out.println("\n현재까지 생성된 Circle Instance는 "+nOfCircles+"개이며, 현재 인스턴스는 "+NINST+"번째로 생성된 것입니다.");
		System.out.println("이 원은 현재 반지름이 "+this.getRadius()+"이며 넓이는 "+this.area()+"이고 둘레의 길이는 "+this.circumference()+"입니다.");
	}
	

	/*
	public int hashCode()
	{
		//return (int)(this.radius*10.0); // Choice 1

		/* Choice 2 //
		int a=(int)this.radius;
		int b=(int)((this.radius-(int)this.radius)*10.0);
		return ((a+101)*103)+b;
	}

	public boolean equals(Circle c)
	{
		if(this.radius==c.radius) return true;
		else return false;
	}

	public boolean equals(Object obj)
	{
		if(obj != null && obj instanceof Circle) return this.radius == ((Circle)obj).radius;
		else return false;
	}

	public String toString( )
	{
		return getClass().getName()+" : [ 반지름 : "+getRadius()+" , 넓이 : "+area()+" , 둘레 : "+circumference()+" ] ";
	}

	 public int compareTo(Circle a) // Comparable 인터페이스를 위하여 작성
	{
		if(this.radius >= a.radius ) return 1;	
		//else if(this.radius == a.radius ) return 0;
		else return -1;
	}
	*/
}