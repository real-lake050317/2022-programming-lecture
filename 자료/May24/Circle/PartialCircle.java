package 자료.May24.Circle;

public class PartialCircle extends Circle 
{
	private double angle=360.0;

	PartialCircle()	{}

	public void setAngle(double angle)
	{
		if(angle <= 0.0) {
			System.out.println("ȣ�� �߽ɰ��� 0.0 ������ �� �����ϴ�. 360.0���� �����մϴ�.\n");
			this.angle=360.0;
		}
		else if(angle > 360.0) {
			System.out.println("ȣ�� �߽ɰ��� 360.0 ���� Ŭ�� �����ϴ�. "+angle+" % 360.0�� ������ �����մϴ�.\n");
			this.angle=angle%360.0;
		}
		else this.angle=angle;
	}

	public double getAngle()
	{
		return this.angle;
	}

	public double area()
	{
		return getRadius()*getRadius()*getPi()*(angle/360.0);
	}

	public double circumference()
	{
		return super.circumference()*(angle/360.0);
	}
}