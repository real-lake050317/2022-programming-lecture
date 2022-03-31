class ArrayCopyTest 
{
	public static void main(String[] args) 
	{
		final int SIZE=20;
		
		int org[]=new int[SIZE];
		for(int i=0;i<org.length;i++){
			org[i]=(int)(Math.random()*50.0+51.0);
		}

		System.out.println("Org Array *****************");
		print(org);
		System.out.println("\n***************************\n");

		// Deep Copy
		/*
		int copied[]=new int[org.length];
		for(int i=0;i<copied.length;i++){
			copied[i]=org[i];
		}
		//*/

		// Shallow Copy
		///*
		int copied[]=org;
		//*/

		///*
		System.out.println("Copied Array *****************");
		print(copied);
		System.out.println("\n***************************\n");
		//*/
		
		///*
		org[4]=-43858;
		copied[2]=-378495976;

		System.out.println("Org Array *****************");
		print(org);
		System.out.println("\n***************************\n");

		System.out.println("Deep Copied Array *****************");
		print(copied);
		System.out.println("\n***************************\n");
		//*/

		///*
		int a=10;
		System.out.println("메소드 호출 전 값 "+a);

		testMethod(a);

		System.out.println("메소드 호출 후 값 "+a);
		//*/

		///*
		System.out.println("메소드 호출 전 배열 원소 값 *****************");
		print(org);
		System.out.println("\n***************************\n");
		
		testMethod(org);

		System.out.println("메소드 호출 후 배열 원소 값 *****************");
		print(org);
		System.out.println("\n***************************\n");
		//*/



	}

	public static void testMethod(int a)
	{
		System.out.println("전달 인자로 넘겨 받은 값 "+a);
		a=a+8494;
		System.out.println("메소드 내에서 변화 시킨 값"+a);
	}

	public static void testMethod(int a[])
	{
		System.out.println("전달 인자로 넘겨 받은 배열의 원소 값*****************");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n***************************\n");
		
		for(int i=0;i<a.length;i++){
			a[i]*=2;
		}

		System.out.println("메소드 내에서 변화시킨 배열의 원소 값*****************");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n***************************\n");
	}

	public static void print(int a)
	{
		System.out.println(a);
	}

	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
