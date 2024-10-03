package hierarchy;

public class Highchild extends Higher {
public void mul()
{
	System.out.println(a*a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Highchild c=new Highchild();
   c.mul();
   c.display();
	}

}
