public class Demo 
{
	void f1()
	{
		System.out.println("inside f1 of zero arg");
	}
	
	void f1(int i)
	{
		System.out.println("inside f1 of one arg : "+ i);
	}
	
	void f1(int i,int j)
	{
		System.out.println("inside f1 of two arg : "+ (i-j));
	}
	
	public static void main(String[] args) 
	{
			Demo d= new Demo();
			d.f1();
			d.f1(10);
			d.f1(20, 5);
		
	}

}
