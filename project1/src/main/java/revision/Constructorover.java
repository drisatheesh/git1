package revision;

public class Constructorover {
 static int x,y;
 static String s;
 
public void Constructorover(int a,int b)
{
	x=a;
	y=b;
	System.out.println("num1="+x);
	System.out.println("num2="+y);
	
}
public void Constructorover(String c)

{
	s=c;
	System.out.println("name1="+s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorover o=new Constructorover();
		o.Constructorover(5,10);
		o.Constructorover("Drisya");
		
		
	}

}
