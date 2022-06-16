package May26;
/**
*	@author		CHKIM &lt;chkim@minjok.hs.kr&gt;
*	@version	0.1
*	@since		2020.02.20 - 7장 Circle 클래스를 상속하는 PartialCircle 클래스입니다.

*	<p>
*	version 0.1의 PartilaCircle클래스는 6장에서 구현한 Circle 클래스를 상속하며 중심각의 추가적인 멤버 변수를 가지는 클래스이며, 상속과 오버라이딩을 이해하기 위한 클래스입니다.
*	생성자가 충분히 구현되지 않았고, 스태틱한 요소들이 고려되지 않았음
*	</p>
*/
public class PartialCircle extends Circle
{
	/**
	*	angle은 PartialCircle클래스에서 추가된 인스턴스 멤버변수로 현재 생성되는 인스턴스의 중심각을 저장하기 위하여 사용한다.
	*/
	private double angle=360.0;

	/**
	*	기본 생성자이며 생성시 반지름은 1.0, 중심각은 360.0도로 세팅한다.
	*/
	public PartialCircle()
	{
		super(1.0);
	}
	
	/**
	*	인수로 주어진 각도를 중심각으로, 반지름은 1.0으로 인스턴스를 생성한다.
	*	@param angle 세팅하고자하는 주심각을 실수형 인수로 제공해야 합니다.
	*/
	public PartialCircle(double angle)
	{
		this(1.0, angle);
	}

	/**
	*	반지름과 중심각도를 인수로 받아 그 값으로 반지름과 중심각을 가지는 인스턴스를 생성한다.
	*	@param radius 세팅하고자하는 실수값을 인수로 제공해야 합니다.
	*	@param angle 세팅하고자하는 중심각을 실수형 인수로 제공해야 합니다.
	*/
	public PartialCircle(double radius, double angle)
	{
		super(radius);
		setAngle(angle);		
	}

	/**
	*	이미 생성된 인스턴스와 동일한 상태의 인스턴스를 생성하기 위한 복사생성자입니다.
	*	@param p 복사하고자 하는 인스턴스를 참조하는 변수를 인수로 제공해야 합니다.
	*/
	public PartialCircle(PartialCircle p)
	{
		this(p.getRadius(), p.getAngle());	
	}

	/**
	*	주어진 인수의 값이 음수라면 360.0, 360.0보다 더 큰 값일 경우라면 그 값의 360.0으로 나눈 나머지 값을, 그 외에는 인자로 제공한 값을 중심각으로 세팅합니다.
	*	@param angle	세팅하고자하는 중심각의 값을 실수형 인수로 제공해야 합니다.
	*/
	public void setAngle(double angle)
	{
		if(angle <= 0.0) {
			System.out.println("호의 중심각은 0.0 이하일 수 없습니다. 360.0도로 세팅합니다.\n");
			this.angle=360.0;
		}
		else if(angle > 360.0) {
			System.out.println("호의 중심각은 360.0 보다 클수 없습니다. "+angle+" % 360.0의 값으로 세팅합니다.\n");
			this.angle=angle%360.0;
		}
		else this.angle=angle;
	}

	/**
	*	현재 인스턴스에 세팅되어 있는 중심각의 각도 값을 반환합니다.
	*	@return double	현재 인스턴스에 세팅되어 있는 중심각의 각도 값을 반환합니다.
	*/
	public double getAngle()
	{
		return this.angle;
	}
	
	/**
	*	현재 인스턴스의 세팅되어 있는 반지름과 중심각을 가진 호의 넓이를 반환합니다.
	*	@return double	현재 인스턴스의 세팅되어 있는 반지름과 중심각을 가진 호의 넓이를 반환합니다.
	*
	*	<p>
	*	Circle에서 상속된 area()메소드를 오버라이딩합니다.
	*	</p>
	*/
	public double area()
	{
		//return radius*radius*pi*(angle/360.0);
		//return getRadius()*getRadius()*getPi()*(angle/360.0);
		return super.area()*(angle/360.0);
	}

	/**
	*	현재 인스턴스의 세팅되어 있는 반지름과 중심각을  가진 호의 둘레를 반환합니다.
	*	@return double	현재 인스턴스의 세팅되어 있는 반지름과 중심각을  가진 호의 둘레를 반환합니다.
	*
	*	<p>
	*	Circle에서 상속된 circumference()메소드를 오버라이딩합니다.
	*	</p>
	*/
	public double circumference()
	{
		return super.circumference()*(angle/360.0);
	}

	/**
	*	현재 인스턴스의 hashCode 값을 구하여 반환합니다.
	*	@return int	현재 인스턴스의 hashCode 값을 구하여 반환합니다.
	*
	*	<p>
	*	Object클래스에서 상속된 hashCode()메소드를 오버라이딩합니다.
	*	</p>
	*/
/*	public int hashCode()
	{
		return (int)((getRadius()*2.0*3.0+1.0)+(getPi()*5.0+7.0+1.0)+(angle*11.0*13.0+1.0));
	}
*/
	/**
	*	인스턴스의 동등성을 검사하여 boolean 값으로 반환합니다.
	*	@return boolean	인스턴스의 동등성을 검사하여 boolean 값으로 반환합니다.
	*
	*	<p>
	*	Object클래스에서 상속된 equals(Object)메소드를 오버라이딩합니다.
	*	</p>
	*/
/*	public boolean equals(Object obj)
	{
		PartialCircle cTmp=(PartialCircle)obj;
		if(this.hashCode()==cTmp.hashCode()) return true;
		else  return false;
	}
*/
	/**
	*	인스턴스의 상태를 나타내는 문자열을 반환합니다.
	*	@return String	인스턴스의 상태를 나타내는 문자열을 반환합니다.
	*
	*	<p>
	*	Object클래스에서 상속된 toString()메소드를 오버라이딩합니다.
	*	</p>
	*/
/*	public String toString()
	{
		String a=this.getNumbersOfCircles()+"번째 인스턴스인 이 부채꼴은 현재 반지름이 "+this.getRadius()+"이며 중심각은 "+angle+"이며 넓이는 "+this.area()+"이고 둘레의 길이는 "+this.circumference()+"입니다.";
		return a;
	}
*/
}