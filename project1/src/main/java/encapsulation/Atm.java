package encapsulation;

public class Atm {
	private int a;
	 public void setter(int a)
	 {
		this.a=a;
	
		
	 }
	 public void validate()
	 {
		if((a==1001)||(a==1234)||(a==1212)) 
		{
			System.out.println("valid pin");
		}
		else
		{
			System.out.println("invalid pin");
		}	
	 }
	 
	 public void getter()
	 {
		 System.out.println(a);
		 //System.out.println(b);
		

	 }
	 
}
