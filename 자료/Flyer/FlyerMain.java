package Flyer;

public class FlyerMain
{
	public static void main(String args[])
	{
		System.out.println(Flyer.fast);

		Bird a=new Bird();
		FlyerUtil.show(a);

		Airplane b=new Airplane();
		FlyerUtil.show(b);

		Flyer s=new Bird();
		FlyerUtil.show(s);

		Flyer t=new Airplane();
		FlyerUtil.show(t);

		//a=b;
		t=s;
		FlyerUtil.show(t);

		Flyer x[]=new Flyer[]{new Bird("Sparrow"), new Airplane("Boeing 747")};
		for(int i=0;i<x.length;i++){
			FlyerUtil.show(x[i]);
		}
	}
}

class FlyerUtil
{
	public static void show(Flyer f){
		System.out.println(f.toString()+" is "+(f.isAnimal()?"":"not ")+"animal. "+f.toString()+" can fly "+f.fly());
	}
}

interface Flyer
{
	int fast=100;
	String fly();
	boolean isAnimal();

	String toString();
}

class Bird implements Flyer
{
	String name="";

	public Bird(){}
	public Bird(String name){ this.name=name; }

	public String fly(){
		return "using Wings.";
	}
		
	public boolean isAnimal(){
		return true;
	}

	public String toString(){
		return "Bird("+name+")";
	}
}

class Airplane implements Flyer
{
	String name="";

	public Airplane(){}
	public Airplane(String name){ this.name=name; }

	public String fly(){
		return "using Engines.";
	}
	
	public boolean isAnimal(){
		return false;
	}

	public String toString(){
		return "Airplane("+name+")";
	}
}