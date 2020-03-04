class bike
	{
		bike()
		{
		System.out.println("bike is created");
		}
	}
class cycle extends bike
	{
	cycle()
	{
		super();
		System.out.println("cycle class is created");
	}
	}
class superclas
	{
		public static void main(String args[])
		{
		cycle c=new cycle();
		}
	}