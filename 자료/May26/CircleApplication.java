package May26;
/*
class CircleApplication
{
	public static void main(String[] args)
	{
		double target=Double.parseDouble(args[0]);
		Circle cir1=new Circle(0.0);
		double delta=0.1;


		double preRad=0.0;
		while(cir1.area()<target)
		{
			preRad+=delta;
			cir1.setRadius(preRad);		
		}

		double candi1, candi2;
		cir1.setRadius(preRad-delta);
		candi1=target-cir1.area();

		cir1.setRadius(preRad);
		candi2=cir1.area()-target;

		System.out.println("원 넓이가 "+target+"인 원의 가장 근접하는 반지름은 "+((candi1>candi2)?preRad:(preRad-delta))+"입니다.");
	}
}
//*/


/*
class CircleApplication
{
	public static void main(String[] args)
	{
		double target=Double.parseDouble(args[0]);
		Circle cir1=new Circle(0.0);
		double delta=0.1;

		while(cir1.area()<target)
		{
			cir1.setRadius(cir1.getRadius()+delta);		
		}//no double preRad!

		double candi1, candi2;
		cir1.setRadius(cir1.getRadius()-delta);
		candi1=target-cir1.area();

		cir1.setRadius(cir1.getRadius()+delta);
		candi2=cir1.area()-target;

		System.out.println("원 넓이가 "+target+"인 원의 가장 근접하는 반지름은 "+((candi1>candi2)?cir1.getRadius():cir1.getRadius()-delta)+"입니다.");
	}
}
//*/