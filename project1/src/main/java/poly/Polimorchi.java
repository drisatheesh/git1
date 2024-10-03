package poly;

public class Polimorchi extends Polymor {
public void add()
{
	c=b-a;
	System.out.println("sub="+c);
	super.add();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polimorchi obj=new Polimorchi();
		obj.add();
	
	}

}
