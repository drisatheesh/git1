package poly;

public class Onseason extends Offseason {

	public void discount()
	{
		super.discount();
		System.out.println("  onseason without discount:"+a);
		c=(a*40)/100;
		System.out.println("after discount:"+c);
		//System.out.println("total price=");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onseason obj=new Onseason();
		obj.discount();
	}

}
