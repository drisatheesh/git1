package aggregation;

public class Agri {
	Aggrigationn x;
int c;
public Agri(int c,Aggrigationn x)
{
	this.c=c;
	this.x=x;
}
public void display()
{
	System.out.println(c);
	System.out.println(x.a);
	System.out.println(x.b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Aggrigationn obj=new Aggrigationn(25,65); 
 Agri ob=new Agri(45,obj);
 ob.display();
	}

}
